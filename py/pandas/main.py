import requests, csv

url = 'https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=IBM&apikey=037M9ZXLXMTHB3ZW&datatype=csv'

with requests.Session() as s:
    download = s.get(url)
    decoded_content = download.content.decode('utf-8')
    stock_data = csv.reader(decoded_content.splitlines(), delimiter=',')
    my_list = list(stock_data)
    for row in my_list:
        print(row)