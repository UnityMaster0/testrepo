import time

def start():
    global startTime
    startTime = time.time()

def end():
    print("Your program took {} seconds to run".format(time.time() - startTime))
