#include <iostream>
using namespace std;

class Person {

    public:
        string first_name;
        string last_name;
        int phone_number;

        void set_name() {
            
            cout << "What is the first name?: ";
            cin >> first_name;

            cout << "What is the last name?: ";
            cin >> last_name;

        }

        void print_name() {

            cout << first_name << " " << last_name << "\n";

        }
            
};

class Worker : public Person {

    public:

        string job;

        void set_job() {

            cout << "Set the job: ";
            cin >> job;

        }

        string print_job() {

            cout << first_name << " " << last_name << "'s job is " << job;
            return job;

        }

    private:

        int salary;

        void set_salary() {

            cout << "Set the salary: ";
            cin >> salary;

        }

        int print_salary() {

            cout << first_name << " " << last_name << "'s salary is " << salary;
            return salary;

        }
};

int main() {

    int times, slot;
    bool running = true;
    Person obj1;
    Person obj2;
    Person obj3;

    while (running = true) {

    cout << "What slot do you want to read/write (1-3): ";
    cin >> slot;
    cout << "How many times do you want to run?: ";
    cin >> times;
    
    if (slot = 1) {
    
        for (int x = 1; x <= times; x++) {

            obj1.set_name();
            obj1.print_name();

        }

    } else if (slot = 2) {

            for (int x = 1; x <= times; x++) {

            obj2.set_name();
            obj2.print_name();

        }

    } else if (slot = 3) {
        
        for (int x = 1; x <= times; x++) {

            obj3.set_name();
            obj3.print_name();

        }

    }
    }
    return 0;

}