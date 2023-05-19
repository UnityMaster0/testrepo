import time
from selenium import webdriver
from selenium.webdriver.common.by import By

browser = webdriver.Chrome('.//chromedriver_linux64/chromedriver')

#browser.get('https://www.amazon.com/Xbox-X/dp/B08H75RTZ8/ref=sr_1_8?crid=VCD9JOX4E28F&keywords=xbox+series+x&qid=1618239251&sprefix=xbox%2Caps%2C188&sr=8-8')
browser.get('https://www.amazon.com/Marvels-Spider-Man-Miles-Morales-Playstation-4/dp/B08QFXCNNZ/ref=sr_1_1?crid=1SOATETZZWPNL&dchild=1&keywords=spiderman+miles+morales+ps4&qid=1625501438&sprefix=spiderman+miles%2Caps%2C167&sr=8-1')

buyButton = False

while not buyButton:
   
    try:

     addToCartBtn = addButton = browser.find_element(By.ID, 'add-to-cart-button')

     print('Item added to cart')
     addToCartBtn.click()
     buyButton = True

     gotocart = browser.find_element(By.ID, 'hlb-ptc-btn-native')
     gotocart.click()

    except:

     print('Unavliable')
     time.sleep(1)
     browser.refresh()

while buyButton:
    browser.get('')
    