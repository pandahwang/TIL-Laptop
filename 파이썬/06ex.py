count = 0
sum = 0
while True:
    svalue = input('Enter a number: ')
    if svalue == 'done':
        break
    try: 
        fvalue = float(svalue)
    except:
        print("Invalid input")
        continue
    count = count + 1
    sum = sum + fvalue
    # print('count: ',count,'sum: ',sum)
print('count: ',count,'sum: ',sum,'average: ', sum/count)