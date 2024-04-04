# # import csv
# # with open("weather_data.csv") as data_file:
# #     data = csv.reader(data_file)
# #     temperature = []
# #     for row in data:
# #         if row[1] != "temp":
# #             temperature.append(int(row[1]))
# # print(temperature)

# import pandas
# data = pandas.read_csv("weather_data.csv")
# # data_dict = data.to_dict()
# # print(data_dict['temp'].values())

# # temperature = data["temp"].to_list()
# # print(temperature)
# # average = sum(temperature) / len(temperature)
# # print(format(average,".2f"))
# print(data[data.day == 'Monday'])
# print(data[data.temp == data.temp.max()])

import pandas

data = pandas.read_csv("2018_Central_Park_Squirrel_Census_-_Squirrel_Data.csv")
gray_squirrel_data = len(data[data["Primary Fur Color"] == "Gray"])
cinnamon_squirrel_data = len(data[data["Primary Fur Color"] == "Cinnamon"])
black_squirrel_data = len(data[data["Primary Fur Color"] == "Black"])
data_dict = {
    "Fur Color" : ["Gray", "Cinnamon", "Black"],
    "Count" : [gray_squirrel_data, cinnamon_squirrel_data, black_squirrel_data]
}
dataframe = pandas.DataFrame(data_dict)
dataframe.to_csv("squirrel_color_dataframe.csv")