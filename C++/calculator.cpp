#include <iostream>
using namespace std;

float add(float add1, float add2) {

  float sum = add1 + add2;
  return sum;
  
}

float subtract(float sub1, float sub2) {

  float difference = sub1 - sub2;
  return difference;

}

float multiply(float mul1, float mul2) {
  
  float product = mul1 * mul2;
  return product;

}

float divide(float div1, float div2) {

  float quo = div1 / div2;
  return quo;
  
}


int main() {
  
  float value1, value2;
  string operation;
  bool flag = true;
  
  while (flag == true) {
    
    cout << "What operation do you want to perform: ";
    cin >> operation;
    
    if ((operation.compare("quit")) == 0) {
      flag = false;
    } else if ((operation.compare("add")) == 0) or ((operation.compare("subtract")) == 0) or ((operation.compare("multiply")) == 0) or ((operation.compare("divide")) == 0) {
      cout << "What is the first value?: ";
      cin >> value1;
      cout << "What is the second value?: ";
      cin >> value2;
    } else {
      cout << "Error, invaild input";
    }
    
    if ((operation.compare("add")) == 0) {
      cout << "Answer: " << add(value1, value2);
    } else if ((operation.compare("subtract")) == 0) {
      cout << "Answer: " << subtract(value1, value2);
    } else if ((operation.compare("multipy")) == 0) {
      cout << "Answer: " << multiply(value1, value2);
    } else if ((operation.compare("divide")) == 0) {
      cout << "Answer: " << divide(value1, value2);
    }
      
  }

  return 0;
  
}
