#include <iostream>
#include "dateinfo.h"
#include "linkedlist.h"
using namespace std;

int main()
{
    Node* head = NULL;
    bool running = true;
    string select, adding;

    while (running == true)
    {
        cout << "What do you want to do?: ";
        cin >> select;

        if (select.compare("add") == 0)
        {
            cout << "What do you want to add?: ";
            cin >> adding;
            append(&head, adding);
        } else if (select.compare("view") == 0)
        {
            cout << "The day is " << month[11] << " " << day[1][1] << ", " << year[2] << endl;
            cout << "The day of the week is " << weekday[0] << endl << "Your events are ";
            printList(head);
            cout << endl;
        } else if (select.compare("exit") == 0)
        {
            running = false;
        }
    }
    return 0;
}
