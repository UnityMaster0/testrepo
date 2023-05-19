import csv
import matplotlib.pyplot as plt

x = []
y = []

with open("data.csv" , 'r') as t:
    lines = csv.reader(t, delimiter=',')
    for row in lines:
        x.append(float(row[0]))
        y.append(float(row[1]))

plt.plot(x, y, color = 'b', marker = 'o', label = "Stock Data")

plt.show()