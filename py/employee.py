class Employee:

    def __init__(self, name, job, pay, *phone):

        self.name = name
        self.job = job
        self.pay = pay
        self.phone = phone

    def listName(self):
        print('Name:', self.name)

    def printPhoneNumber(self):
        print('Phone Number:', '({}{}{}) {}{}{}-{}{}{}{}'.format(*self.phone))

    def listJob(self):
        print('Job:', self.job)

    def listPay(self):
        print('Pay:', self.pay)

    def listAll(self):
        self.listName()
        self.printPhoneNumber()
        self.listJob()
        self.listPay()
        print('')

running = True

while running == True:
    selector = input("What do you want to do?: ")

    if selector == 'add new':
        name = input('What is their name?: ')
        job = input('What is their job?: ')
        pay = input('What is their pay?: ')

        employee = Employee(name, job, pay)

    elif selector == 'view':
        
        employee.listAll()

    elif selector == "quit":
        running = False

    else:
        print("Invalid input")