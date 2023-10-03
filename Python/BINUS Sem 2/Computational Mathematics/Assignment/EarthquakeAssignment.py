import pandas as pd
import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
from scipy import stats

df = pd.read_csv("earthquake.csv")
# print(df)

plt.ioff()

def totalEarthquakes():
    total_earthquakes = df.time.count()
    return total_earthquakes

def averageDepth():
    avgDepth = df.depth.mean()
    return avgDepth

def averageMagnitude():
    avgMagnitude = df.mag.mean()
    return avgMagnitude

def modeEarthquakeArea():
    modeEarthquakeArea = df.place.mode()
    return modeEarthquakeArea

# sum of earthquakes in 2014
total_earthquakes = totalEarthquakes()
print("There are " + str(total_earthquakes) + " total earthquakes in United States in 2014.")

# average magnitude
avgMagnitude = averageMagnitude()
print("With an average magnitude of " + str(avgMagnitude)+",")

# mode earthquake area
modeEarthquakeArea = modeEarthquakeArea()
print("Most of these earthquakes happen in "+str(modeEarthquakeArea))

# average depth of earthquakes
avgDepth = averageDepth()
print("The average depth of these earthquakes are " + str(avgDepth)+".")

# graph
print(" ")
print("As seen in the graph, almost all of these earthquakes have magnitudes less than 6")
print("Majority of them are between 0 and 2 magnitudes.")
print("Thus, it can be said that most these earthquakes are not dangerous")
print("Therefore, there is a high probability that if an earthquake happens, the magnitude is between 0 and 2")

# this graph shows the dispersion of the magnitudes
x = df.groupby('mag')[['time']].count()
x.plot()
plt.xlabel('Magnitude Size')
plt.ylabel('Count')
plt.suptitle('Magnitude Dispersion Graph')


plt.show()


