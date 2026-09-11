/*
        *
      * *
    * * *
  * * * *
* * * * *

i=0
outerloop = 4-0 = 4 spaces
inner loop = 0+1 = 1 star

i=1
outerloop = 4-1 = 3 spaces
inner loop = 1+1 = 2 stars

i=2
outerloop = 4-2 = 2 spaces
inner loop = 2+1 = 3 stars

i=3
outerloop = 4-3 = 1 space
inner loop = 3+1 = 4 stars

i=4
outerloop = 4-4 = 0 spaces
inner loop = 4+1 = 5 stars
*/

#include<iostream>
using namespace std;
int main(){
    int n;
    cin >> n;

    for(int i = 1; i <= n; i++)
    {
        // spaces
        for(int j = 1; j <= n - i; j++)
        {
            cout << "  ";
        }

        // stars
        for(int j = 1; j <= i; j++)
        {
            cout << "* ";
        }

        cout << endl;
    }
}
