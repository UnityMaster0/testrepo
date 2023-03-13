#include <iostream>
using namespace std;

int main() {
    int* var = new int;
    *var = 12;

    cout << "The value of 'var' is " << *var << endl;
    cout << "The address pointed to by 'var' is " << var << endl;
    cout << "The address of 'var' is " << &var << endl;

    delete var;

    return 0;
}