#ifndef DATEINFO_H_
#define DATEINFO_H_

#include <iostream>
using namespace std;

int year[5] = {2021, 2022, 2023, 2024, 2025};

int day[4][10] = {
    {1,2,3,4,5,6,7,8,9,10},
    {11,12,13,14,15,16,17,18,19,20},
    {21,22,23,24,25,26,27,28,29,30},
    {31}
};

string month[12] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

string weekday[7] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

#endif