hand = open('mbox-short.txt')

for list in hand :
    list = list.rstrip()
    words = list.split()
    print (words)
    if len(words) < 3 or words[0] != 'From' :
        continue
    print(words[1])