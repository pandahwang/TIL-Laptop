fhand = open('mbox-short.txt')
for line in fhand:
    ly = line.rstrip()
    print(ly.upper())