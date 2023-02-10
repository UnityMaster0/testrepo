class Employee:

    def __init__(self, name, job, pay, *phone):

        self.name = name
        self.job = job
        self.pay = pay
        self.phone = phone

    def list_name(self):
        print('Name:', self.name)

    def print_phone_number(self):
        print('Phone Number:', '({}{}{}) {}{}{}-{}{}{}{}'.format(*self.phone))

    def list_job(self):
        print('Job:', self.job)

    def list_pay(self):
        print('Pay:', self.pay)

    def list_all(self):
        self.list_name()
        self.print_phone_number()
        self.list_job()
        self.list_pay()
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
        
        employee.list_all()