import time
from selenium import webdriver
from selenium.webdriver.common.by import By

user_email = input('What is your email?: ')
user_password = input('What is your password?: ')

browser = webdriver.Chrome('.//chromedriver_linux64/chromedriver')


# Paste your link here
browser.get('bestbuy.com') # <--------


buyButton = False

while not buyButton:
   
    try:

     addToCartBtn = addButton = browser.find_element(By.CLASS_NAME, 'c-button-disabled')

     print('Unavliable')
     time.sleep(1)
     browser.refresh()

    except:

     addToCartBtn = addButton = browser.find_element(By.CLASS_NAME, 'c-button-primary')
     print('Item added to cart')
     addToCartBtn.click()
     buyButton = True

     #Paste new link before running
     browser.get('https://www.bestbuy.com/identity/signin?token=tid%3A4fe745d8-2554-11ec-a114-005056ae2547')

     browser.find_element(By.XPATH, "//input[contains(@id,'fld-e')]").send_keys(user_email)

     browser.find_element(By.XPATH, "//input[contains(@id,'fld-p1')]").send_keys(user_password)

     browser.find_element(By.XPATH, "//button[contains(@class,'c-button')]").click()
     print('Signed In')
     print('Ready to Place Order')
