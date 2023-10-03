import calendar

c = calendar.TextCalendar(calendar.SUNDAY)
str = c.formatmonth(2019, 11)

print(str)