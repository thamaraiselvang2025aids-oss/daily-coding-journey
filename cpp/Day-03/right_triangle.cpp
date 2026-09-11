/*
print right angle triangle
*
* *
* * *
* * * *
* * * * *
step 1: find no.of rows =outer loop
step 2: find no of columns / items in each row for inner loop
*/
#include <iostream>
using namespace std;

int main(){
    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= i; j++)   // no of stars = no of rows 
        {
            cout << "* ";
        }

    cout << endl;
    }
}