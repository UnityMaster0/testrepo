#include <iostream>
using namespace std;

class Person
{

    public:
        string first_name;
        string last_name;
        int phone_number;

        void set_name()
        {
            cout << "What is the first name?: ";
            cin >> first_name;

            cout << "What is the last name?: ";
            cin >> last_name;
        }

        void print_name()
        {
            cout << first_name << " " << last_name << endl;
        }
            
};

class Worker:public Person
{

    public:
        string job;

        void set_job()
        {
            cout << "Set the job: ";
            cin >> job;
        }

        string print_job() {
            cout << first_name << " " << last_name << "'s job is " << job;
            return job;
        }

    private:
        int salary;

        void set_salary()
        {
            cout << "Set the salary: ";
            cin >> salary;
        }

        int print_salary()
        {
            cout << first_name << " " << last_name << "'s salary is " << salary;
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
        } else if ((slot.compare("1w")) == 0)
        {
            obj1.set_name();
        } else if ((slot.compare("2w")) == 0)
        {
            obj2.set_name();
        } else if ((slot.compare("3w")) == 0)
        {   
            obj3.set_name();
        } else if ((slot.compare("1r")) == 0)
        {   
            obj1.print_name();
        } else if ((slot.compare("2r")) == 0)
        {   
            obj2.print_name();
        } else if ((slot.compare("3r")) == 0)
        {   
            obj3.print_name();
        } else
        {
            cout << "Error, invalid input\n";
        }
    }
    return 0;
}