# def computepay(hour, rate):
#     if hour > 40 :
#         normalpay = hour * rate
#         overtimepay = (hour - 40) * rate / 2
#         pay = normalpay + overtimepay
#     else :
#         pay = hour * rate
#     print("입력하신 시간은", hour,"시간이며, 시급은", rate , "원 입니다.")
#     return pay
# sh = input("Enter Hours: ")
# sr = input("Enter Rates: ")
# try: 
#     ih = float(sh)
#     ir = float(sr)
# except:
#     print("숫자를 입력해주세요!!")
#     quit()
# pay = computepay(ih, ir)
# print("Your pay is", pay)

list = ['fighter', 'shooter', 'magician']
for userclass in list:
    print("We have ", userclass)
print("Please select your class")