/*
* * * * * * * * *      <- 0 spaces + 9 stars
  * * * * * * *        <- 1 space  + 7 stars
    * * * * *          <- 2 spaces + 5 stars
      * * *            <- 3 spaces + 3 stars
        *              <- 4 spaces + 1 star

No of rows = 5
Spaces in each row = i
Stars in each row = 2 * (n-i)-1
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
        for(int j = 0; j < 2 * (n-i) - 1; j++){
            cout << "* ";
        }

        cout << endl;
    }
}
