def translate(text):
    vowels = ["a", "e", "i", "o", "u", " "]
    string = text
    a = ""
    for i in text:
        if i not in vowels:
            a = a + i + "o" + i
        else: a = a + i
    print(a)
translate("this is fun")