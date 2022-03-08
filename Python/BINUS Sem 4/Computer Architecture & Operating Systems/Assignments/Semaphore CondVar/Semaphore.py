
def useBattery(battery):
    while (battery>0):
        battery = battery - 1
    print("Battery level is:", battery)
    return battery

def chargeBattery(battery):
    battery = battery + 1
    print("Battery level is:", battery)
    return battery

battery = 1
print("Original battery level is:", battery)

battery = chargeBattery(battery)
battery = useBattery(battery)

battery = chargeBattery(battery)
battery = useBattery(battery)

battery = chargeBattery(battery)
battery = useBattery(battery)

