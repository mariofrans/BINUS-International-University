import string

def caeser_cipher(str):
    alphabet = string.ascii_lowercase
    new_word = ""
    for x in str:
        next = alphabet.find(x) + 13
        if next > 26:
            next = next-26
        new_letter = alphabet[next]
        new_word = new_word + new_letter
    return new_word

print(caeser_cipher("mario"))
