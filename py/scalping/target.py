import time
from selenium import webdriver
from selenium.webdriver.common.by import By

user_email = input('What is your email?: ')
user_password = input('What is your password?: ')

browser = webdriver.Chrome('.//chromedriver_linux64/chromedriver')

# browser.get('https://www.target.com/p/xbox-series-x-console/-/A-80790841#lnk=sametab')
browser.get('https://www.target.com/p/driven-8211-toy-recycling-truck-with-remote-control-8211-micro-series/-/A-79391476')

buyButton = False

while not buyButton:

    try:
        addToCartBtn = addButton = browser.find_element(
            By.XPATH, "//button[contains(@class,'BaseButton-sc-3v3oog-0 ButtonPrimary-sc-9wgfzx-0 styles__StyledPrimaryButton-sc-1f2lsll-0 eVHdWy JRFKP bebHXQ')]")

        print('Item added to cart')
        addToCartBtn.click()
        buyButton = True

    except:

        print('Unavliable')
        time.sleep(1)
        browser.refresh()

while buyButton:

    # Paste new link before running
    browser.get(
        'https://www.target.com/co-login?shouldMergeCart=false&redirectToStep=PRECHECKOUT')

    browser.find_element(
        By.XPATH, "//input[contains(@class,'Input__StyledInput-sc-1hug1ai-0 sc-bBrOnJ bhhAF')]").send_keys(user_email)

    browser.find_element(
        By.XPATH, "//input[contains(@id,'password')]") .send_keys(user_password)

    browser.find_element(By.XPATH, "//button[contains(@id,'login')]") .click()

    print('Signed In')
    print('Ready to Place Order')
