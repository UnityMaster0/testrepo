import time

def start():
    global start_time
    start_time = time.time()

def end():
    print("Your program took {} seconds to run".format(time.time() - start_time))
