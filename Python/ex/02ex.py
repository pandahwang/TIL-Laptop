# hour = input("Enter hour: ")
# rate = input("Enter rate: ")
# pay = int(hour) * int(rate)
# print("Your pay is", pay)

# x=5
# if x<2:
#     print("small")
# elif x<10:
#     print("medium")
# print("All Done")

sh = input("Enter Hours: ")
sr = input("Enter Rates: ")
ih = float(sh)
ir = float(sr)
if ih > 40 :
    normalpay = ih * ir
    overtimepay = (ih - 40) * ir / 2
    pay = normalpay + overtimepay
else :
    pay = ih * ir
print("Your pay is", pay)