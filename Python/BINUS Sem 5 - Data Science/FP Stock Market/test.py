from variables import *
from functions import *

TICKER = 'TLKM.JK'

MAX_DATE = False
MONTHS_HISTORY = 36
end_date = date.today()
start_date = date.today() - relativedelta(months=MONTHS_HISTORY)

df = fetch_data(TICKER, start_date, end_date)
print(df)

print(strategy__MACD_Crossover(df, start_date, end_date))