#include <iostream>
using namespace std;

class Person
{

public:
    string firstName;
    string lastName;
    int phoneNumber;

    void setName()
    {
        cout << "What is the first name?: ";
        cin >> firstName;

        cout << "What is the last name?: ";
        cin >> lastName;
    }

    void printName()
    {
        cout << firstName << " " << lastName << endl;
    }
};

class Worker : public Person
{

public:
    string job;

    void setJob()
    {
        cout << "Set the job: ";
        cin >> job;
    }

    string printJob()
    {
        cout << firstName << " " << lastName << "'s job is " << job;
        return job;
    }

private:
    int salary;

    void setSalary()
    {
        cout << "Set the salary: ";
        cin >> salary;
    }

    int printSalary()
    {
        cout << firstName << " " << lastName << "'s salary is " << salary;
        return salary;
    }
};

int main()
{
    string slot;
    bool running = true;
    Person obj1;
    Person obj2;
    Person obj3;

    while (running)
    {
        cout << "What slot do you want to read/write (1r-3r or 1w-3w): ";
        cin >> slot;

        if ((slot.compare("quit")) == 0)
        {
            running = false;
        }
        else if ((slot.compare("1w")) == 0)
        {
            obj1.setName();
        }
        else if ((slot.compare("2w")) == 0)
        {
            obj2.setName();
        }
        else if ((slot.compare("3w")) == 0)
        {
            obj3.setName();
        }
        else if ((slot.compare("1r")) == 0)
        {
            obj1.printName();
        }
        else if ((slot.compare("2r")) == 0)
        {
            obj2.printName();
        }
        else if ((slot.compare("3r")) == 0)
        {
            obj3.printName();
        }
        else
        {
            cout << "Error, invalid input\n";
        }
    }
    return 0;
}