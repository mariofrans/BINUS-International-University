#number1

import os
import string

def replaceWord(stringValue):
    dataPunctuation = string.punctuation

    for i in dataPunctuation:
        stringValue = stringValue.replace(i, '')
    return stringValue

def hapax(filename):
    filename = filename.lower()
    readFile = open(os.getcwd() + "/" +filename, 'r')
    data = readFile.read().lower()
    data = data.split()
    listOccurs = {}
    for i in data:
        current = replaceWord(i)
        listOccurs.setdefault(current, 0)
        listOccurs[current] = listOccurs[current] + 1

    print("Total Words : " + str(len(listOccurs)))
    print("-------------------------------------------------------------------------------- ")
    print("Hapax word : ")
    print("-------------------------------------------------------------------------------- ")

    for i in listOccurs.keys():
        nOccurs = listOccurs.get(i)
        if(nOccurs == 1):
            print(i , end=",")

    print()
    print("Most common : ")
    print("-------------------------------------------------------------------------------- ")
    maximum = max(listOccurs, key=listOccurs.get)
    print(maximum, listOccurs[maximum])

hapax("plaintextparis")

# number2

import os

def createNewFile(filename):
    newPath = os.getcwd() + "\\newFile.txt"
    filename = filename.lower()
    readFile = open(os.getcwd() + "\\" + filename, 'r')

    newFile = open(newPath, 'w')

    n= 1
    for i in readFile:
        newFile.write(str(n) + ". " + i)
        n =n + 1

    readFile.close()
    newFile.close()
    print("New File Created\n" + "Location : "+newPath)

createNewFile("plaintextparis_number")

# #number3

def getAverageWord(filename):
    readFile = open(filename, 'r', encoding='latin-1')
    data = readFile.read().split()

    numberOfWord = len(data)
    totalWordLength = len(''.join(data))

    return totalWordLength / numberOfWord

print("Average word length is "+str(getAverageWord("plaintextparis.webarchive")))

#number4

from collections import defaultdict


def order_words(words):
    byfirst = defaultdict(set)
    for word in words:
        byfirst[word[0]].add(word)
    # byfirst = dict(byfirst)
    return byfirst


def linkfirst(byfirst, sofar):
    '''\
    For all words matching last char of last word in sofar as FIRST char and not in sofar,
    return longest chain as sofar + chain
    '''

    assert sofar
    chmatch = sofar[-1][-1]
    options = byfirst[chmatch] - set(sofar)
    # print('  linkfirst options: %r %r' % (chmatch, options))
    if not options:
        return sofar
    else:
        alternatives = (linkfirst(byfirst, list(sofar) + [word])
                        for word in options)
        mx = max(alternatives, key=len)
        # input('linkfirst: %r' % mx)
        return mx


def llfl(words):
    byfirst = order_words(words)
    return max((linkfirst(byfirst, [word]) for word in words), key=len)


if __name__ == '__main__':
    pokemon = '''audino bagon baltoy banette bidoof braviary bronzor carracosta charmeleon
    cresselia croagunk darmanitan deino emboar emolga exeggcute gabite
    girafarig gulpin haxorus heatmor heatran ivysaur jellicent jumpluff kangaskhan
    kricketune landorus ledyba loudred lumineon lunatone machamp magnezone mamoswine
    nosepass petilil pidgeotto pikachu pinsir poliwrath poochyena porygon2
    porygonz registeel relicanth remoraid rufflet sableye scolipede scrafty seaking
    sealeo silcoon simisear snivy snorlax spoink starly tirtouga trapinch treecko
    tyrogue vigoroth vulpix wailord wartortle whismur wingull yamask'''
    pokemon = pokemon.strip().lower().split()
    pokemon = sorted(set(pokemon))
    l = llfl(pokemon)
    for i in range(0, len(l), 8): print(' '.join(l[i:i + 8]))
    print(len(l))

#number 5

import os

def convertToSentence(filename):
    readFile = open(os.getcwd() + "\\" + filename, 'r')
    stringValue = readFile.read()

    titles = ["Mr.", "Mrs.", "Dr."]
    data = stringValue.split()
    result = ""
    n= 0
    for i in data:
        temp = i + " "
        if(i.endswith(".") or i.endswith("?") or i.endswith("!")):
            if(n != len(data) -1):
                if(i not in titles and str(data[n + 1][0]).isupper()):
                    temp = temp + "\n"
        n = n +1
        result = result + temp
    return result

print(convertToSentence("shortText.txt"))