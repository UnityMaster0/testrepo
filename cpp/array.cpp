#include <iostream>
using namespace std;

int main()
{
    // A 1D array
    string array1d[] = {"Hello", ", ", "World", "!"};
    cout << array1d[0] << array1d[1] << array1d[2] << array1d[3] << endl;

    // A 2D array
    int array2d[][5] = {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10}};
    cout << array2d[1][2] << endl;

    // A 3D array
    int array3d[][2][5] = {
        {{1, 2, 3, 4, 5},
         {6, 7, 8, 9, 10}},
        {{11, 12, 13, 14, 15},
         {16, 17, 18, 19, 20}}};

    for (int i = 0; i < 2; i++)
    {
        for (int u = 0; u < 2; u++)
        {
            for (int y = 0; y < 5; y++)
            {
                cout << array3d[i][u][y] << endl;
            }
        }
    }
    return 0;
}