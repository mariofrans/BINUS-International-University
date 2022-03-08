import pandas as pd
import ast

# remove pandas warnings
pd.set_option('mode.chained_assignment', None)

####################################################################################################################

""" READ & DISPLAY DATA IN DATAFRAME FORMAT """

# data path
path_movies_metadata = 'BINUS Sem 5/Data Science/Week2_Assignment/data/movies_metadata.csv'
path_ratings_small = 'BINUS Sem 5/Data Science/Week2_Assignment/data/ratings_small.csv'
path_preprocessed_data = 'BINUS Sem 5/Data Science/Week2_Assignment/preprocessed-data.csv'

# read both files in df format
df_movies_metadata = pd.read_csv(path_movies_metadata)
df_ratings_small = pd.read_csv(path_ratings_small)

print('\nMovies Metadata:')
print(df_movies_metadata)
print('\nRatings Small:')
print(df_ratings_small)

####################################################################################################################

""" DETERMINE, DISPLAY & REMOVE STRANGE VALUES FROM DATAFRAME """

# check for strage values (non-int) in 'id' column (returns column of booleans)
df_movies_metadata['id_isInteger'] = df_movies_metadata['id'].str.isnumeric()

# df of strange values from df_movies_metadata['id']
df_strange = df_movies_metadata['id'].loc[df_movies_metadata['id_isInteger']==False]
print('\nStrange Values & Indexes:')
print(df_strange)

# remove strange values from df_movies_metadata
df_movies_metadata = df_movies_metadata.loc[df_movies_metadata['id_isInteger']==True]
# drop the 'id_isInteger' we created earlier
df_movies_metadata = df_movies_metadata.drop(columns=['id_isInteger'])
# convert all 'id' column values into integer
df_movies_metadata['id'] = df_movies_metadata['id'].astype(int)
print('\nFiltered Movies Metadata (No Strange Values):')
print(df_movies_metadata)

####################################################################################################################

""" MERGE DATAFRAMES, REMOVE MISSING DATA, & REMOVE INSIGNIFICANT COLUMNS """

# merge df_movies_metadata with df_ratings_small
df = pd.merge(df_movies_metadata, df_ratings_small, left_on='id', right_on='movieId')
print('\nMerged Dataframe (Movies Metadata & Ratings Small):')
print(df)

# df of columns with missing values
df_missing_values = df.isnull().sum().loc[df.isnull().sum()!=0]
print('\nColumns With Missing Values:')
print(df_missing_values)
print("Total Missing Values:", df_missing_values.sum())

# remove all columns which have:
# 1. too much missing value 
# 2. do not have relationship with user ratings
# 3. repititive information
columns_too_much_missing = ['belongs_to_collection', 'homepage', 'tagline']
columns_no_relationship = [ 'imdb_id', 'overview', 'poster_path', 'release_date', 'spoken_languages', 
                            'status', 'video', 'userId', 'timestamp']
columns_repititive = ['original_title', 'id']
columns_remove = columns_too_much_missing + columns_no_relationship + columns_repititive
df = df[[i for i in df.columns if i not in columns_remove]]

# I did not apply any inputation technique as I dont think the final data is suitable for inputation
# on the other hand, after removing columns, there are only 4 rows containing empty values left
# remove all leftover rows with missing values (only 4)
df = df.dropna()

print('\nDataframe (To Be Preprocessed)')
print(df)

####################################################################################################################

""" PREPROCESS REMAINING DATA """

def one_hot_encoding(df, column, id, top_3=False):

    # gather all unique ids from column of nested dictionaries
    list_unique_id = []
    
    for i in df[column]:
        # create temp df to manipulate the list of dictionaries in cell
        temp_df = pd.DataFrame(ast.literal_eval(i))
        if id in list(temp_df.columns):
            for j in temp_df[id]:
                if j not in list_unique_id: list_unique_id.append(j)
                
    # print(list_unique_id)

    # create sub-columns of 0s for each unique ids
    for i in list_unique_id: df[f'{column}-{i}'] = 0

    # encode/fill in the new sub-columns
    for i in range(len(df[column])):
        # create temp df to manipulate the list of dictionaries in cell
        temp_df = pd.DataFrame(ast.literal_eval( df[column].iloc[i] ))
        if id in list(temp_df.columns):
            for j in temp_df[id]: df.loc[i, f'{column}-{j}'] = 1

    # drop no longer used main column
    df = df.drop(columns=[column])
    # remove any rows with missing value
    df = df.dropna()

    # if this option is chosen:
    # select only the top 3 most popular sub-columns
    if top_3==True:

        # 1. 'Column' consist of the current column name
        # 2. 'SubColumn' consist of the unique sub-column names
        # 3. 'Sum' is the sum of each unique sub-column (to determine which column is the most popular)
        temp_df = pd.DataFrame()
        temp_df['SubColumn'] = list_unique_id
        temp_df['Sum'] = [df[f'{column}-{i}'].sum() for i in list_unique_id]

        # sort by & select only the top 3 most popular sub-columns
        temp_df = temp_df.sort_values(by=['Sum'])
        temp_df = temp_df.head(3)

        # remove the top 3 sub-columns from list_unique_id (as they will remain unchanged)
        for i in temp_df['SubColumn']: list_unique_id.remove(i) 

        # create a new column named (others)
        # encode/fill in this column if data is present on the other sub-columns (non-top 3 sub-columns)
        df[f'{column}-others'] = 0
        for i in list_unique_id: df[f'{column}-others'] += df[f'{column}-{i}']
        df[f'{column}-others'] = (df[f'{column}-others'] > 0).astype(int)

        # drop no longer used sub-columns
        remove_columns = [f'{column}-{i}' for i in list_unique_id]
        df = df.drop(columns=remove_columns)

    return df

# one hot encode (preprocess) each categorical column of nested dictionaries
# note: this preprocessing may take a while
df = one_hot_encoding(df, 'genres', 'id')
df = one_hot_encoding(df, 'production_companies', 'id', top_3=True)
df = one_hot_encoding(df, 'production_countries', 'iso_3166_1', top_3=True)

print('\nFinal Preprocessed Dataframe:')
print(df)

# save data to csv file
df.to_csv(path_preprocessed_data)

####################################################################################################################