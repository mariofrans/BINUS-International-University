def char_freq(input_string):
    list_of_words = {}
    for letter in input_string:
        if letter not in list_of_words.keys():
            list_of_words[letter] = 1
        else:
            list_of_words[letter] += 1
    print(list_of_words)
char_freq("mario")