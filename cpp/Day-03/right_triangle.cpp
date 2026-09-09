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
for(int i = 1; i <= n; i++)
{
    for(int j = 1; j <= i; j++)
    {
        cout << "* ";
    }

    cout << endl;
}