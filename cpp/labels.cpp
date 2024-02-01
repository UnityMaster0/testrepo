#include <iostream>
using namespace std;

int main() {

    first:
        goto test;

    test:
        for (int i = 0; i < 2; i++) {
                
            printf("First");

            for (int v = 0; v < 2; v++) {

                printf("Second");
                goto next;
                
            }
        }

    next:
        printf("Exited Loop");
        goto first;

    return 0;
}
