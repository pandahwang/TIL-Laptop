import pandas

data = pandas.read_csv("weather_data.csv")
temp_list = data["temp"].to_list()
max = temp_list.Series.max()
print(max)