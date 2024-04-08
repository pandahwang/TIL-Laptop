# # Day 2 Tip Calculator
print("Welcome to the tip calculator. ")
total = float(input("What was the total bill? "))
people = int(input("How many people to split the bill? "))
tip = int(input("What percentage tip would you like to give? 10, 12, or 15? "))
pay = round((total + (total * tip / 100)) / people, 2)
print(f"Each person should pay: {pay}$")

# # # Split Two digit into One digit and add each other.
# number = input()
# first_num = int(number[0])
# second_num = int(number[1])
# print(first_num + second_num)

# # Life in Weeks

# age = int(input())
# years = 90 - age
# remain = years * 52
# print(f"You have {remain} weeks left.")