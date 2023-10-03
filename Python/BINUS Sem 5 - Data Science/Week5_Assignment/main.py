import pandas as pd
import matplotlib.pyplot as plt
from matplotlib import gridspec

path_iris_data = 'BINUS Sem 5/Data Science/Week5_Assignment/data/iris.csv'
path_graph = 'BINUS Sem 5/Data Science/Week5_Assignment/graph.jpeg'

# read data
df = pd.read_csv(path_iris_data)
# find unique species
species = list(df['species'].unique())
# split df based on species
list_df_species = [df.loc[df['species']==s] for s in species]

# set figure & subplots configurations
plt.figure(figsize=(15,5))
gs = gridspec.GridSpec(1, 3)
ax = [plt.subplot(gs[i]) for i in range(3)]

i = 0

for df_s in list_df_species:

    # graph 1
    ax[0].scatter(df_s['sepal_length'], df_s['petal_length'])
    ax[0].set_title('Scatter Plot of sepal_length and petal_length')
    ax[0].set_ylabel('petal_length')
    ax[0].set_xlabel('sepal_length')

    # graph 2
    ax[1].hist(df_s['sepal_length'], density=True, label=species[i])
    ax[1].set_title('Histogram of sepal_length')
    ax[1].set_ylabel('Density')
    ax[1].legend()

    i += 1  

# graph 3
data = [list(df_s['sepal_length']) for df_s in list_df_species]
ax[2].boxplot(data, widths=2, positions=[1, 4, 7])
ax[2].set_title('Box Plot of sepal_length')
ax[2].set_xticklabels(species)

# save plotted chart
plt.tight_layout()
plt.savefig(path_graph)
