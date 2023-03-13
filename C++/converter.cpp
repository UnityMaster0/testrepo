#include <iostream>
using namespace std;

class Unit {

    public:
        int gram(string unit, int value) {
            
            if ((unit.compare("ounce") == 0)) {
                return (value * 0.03527396);    
            } else if ((unit.compare("lbs") == 0)) {
                return (value * 0.002204623);
            } else if ((unit.compare("kg") == 0)) {
                return (value * 0.001);
            } else {return 0;}
        }

        int meter(string unit, int value) {

            if ((unit.compare("in") == 0)) {
                return (value * 39.37008);    
            } else if ((unit.compare("ft") == 0)) {
                return (value * 3.28084);
            } else if ((unit.compare("cm") == 0)) {
                return (value * 100);
            }  else if ((unit.compare("mm") == 0)) {
                return (value * 1000);
            } else {return 0;}
    }
};

int main() {

    int value;
    string unitBeingConverted, unitConvertedTo;
    Unit converter;

    cout << "What is your starting value?: ";
    cin >> value; 
    cin >> unitBeingConverted;
    cout << endl;

    cout << "What do you want to convert to?: \n";
    cin >> unitConvertedTo;

    if ((unitBeingConverted.compare("g") == 0)) {
        cout << converter.gram(unitConvertedTo, value) << endl;
    } else if ((unitBeingConverted.compare("m") == 0)) {
        cout << converter.gram(unitConvertedTo, value) << endl;
    }
    
    return 0;
}