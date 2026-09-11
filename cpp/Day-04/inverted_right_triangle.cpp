/*
* * * * *
* * * *
* * *
* *
*
*/

/*
no of rows = i=5
no of stars in row 1 (i=0)=5  j=5-0 gives 5 stars
no of stars in row 2 (i=1)=4  j=5-1
no of stars in row 3 (i=2)=3  j=5-2
no of stars in row 4 (i=3)=2  j=5-3
no of stars in row 5 (i=4)=1  j=5-4

pattern for inner loop = 5-i
*/
#include<iostream>
using namespace std;
int main (){
    for(int i=0;i<5;i++){
        for(int j=5-i;j>0;j--){
            cout<<("* ");
        }
        cout<<endl;
    }
}