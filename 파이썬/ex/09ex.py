filename = input('Enter a file name: ')
hand = open(filename)

counts = dict()
for line in hand:
    words = line.split()
    for word in words:
        counts[word] = counts.get(word,0)+1

bigword = None
bigcount = None
for word, count in counts.items():
    if bigcount is None or counts[word] > bigcount :
        bigword = word
        bigcount = count

print(bigword, bigcount)