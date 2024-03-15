numlist = list()
while True:
    inp = input('Enter a number: ')
    if inp == 'done':
        break
    value = float(inp)
    numlist.append(value)
print('Total: ', sum(numlist))
print('Average: ', sum(numlist) / len(numlist))