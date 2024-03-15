sh = input("Enter Hours: ")
sr = input("Enter Rates: ")
try: 
    ih = float(sh)
    ir = float(sr)
except:
    print("숫자를 입력해주세요!!")
    quit()
if ih > 40 :
    normalpay = ih * ir
    overtimepay = (ih - 40) * ir / 2
    pay = normalpay + overtimepay
else :
    pay = ih * ir
print("Your pay is", pay)
