import requests
from bs4 import BeautifulSoup
import smtplib
import time


while True:
    try:
        while True: #for sending email at every day
            email = 'bkaplan10001@gmail.com'
            receiver_email = 'sukranevrenkaplan@gmail.com'
            random_password = 'cvvbsgxqkuziqgsd'
            url = 'http://books.toscrape.com/catalogue/sapiens-a-brief-history-of-humankind_996/index.html'
            protocol = 'smtp.gmail.com'
            re = requests.get(url)
            res = re.content
            soup = BeautifulSoup(res, 'html.parser')
            string = soup.find('p', class_='price_color').text[1:]
            price = float(string)
            print(price)
            if price < 60:
                smt = smtplib.SMTP(protocol, 587) #set protocol
                smt.ehlo()
                smt.starttls() #transport  layer security protocol setting
                smt.login(email, random_password) #loging to the account
                smt.sendmail(email, #sending email
                         receiver_email,
                         f"Subject: The price of the Sapiens book has decreased to below 60!")
                smt.quit()
                time.sleep(100*100*10)
            
            if price <=0: #for invalid book prices
                break
            
    except Exception as ex:
        print(ex)

