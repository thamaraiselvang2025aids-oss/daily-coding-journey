/*
        *              <- 4 spaces + 1 star
      * * *            <- 3 spaces + 3 stars
    * * * * *          <- 2 spaces + 5 stars
  * * * * * * *        <- 1 space  + 7 stars
* * * * * * * * *      <- 0 spaces + 9 stars
*/

#include<iostream>
using namespace std;
int main(){
    int n;
    cin >> n;

    for(int i = 1; i <= n; i++){
        // spaces
        for(int j = 1; j <= n - i; j++){
            cout << "  ";
        }

        // stars
        for(int j = 1; j <= 2 * i - 1; j++){
            cout << "* ";
        }

        cout << endl;
    }
}
