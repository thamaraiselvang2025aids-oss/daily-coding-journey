/*
* * * * *
  * * * *
    * * *
      * *
        *

Number of rows = 5
Spaces in each row = i
Stars in each row = n-i

*/

#include<iostream>
using namespace std;
int main(){
    int n;
    cin >> n;

    for(int i = 0; i < n; i++){
        // spaces
        for(int j = 0; j < i; j++){
            cout << "  ";
        }

        // stars
        for(int j = 0; j < n - i; j++){
            cout << "* ";
        }

        cout << endl;
    }   
}
