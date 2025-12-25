/*You are given a number n, you have to use the if statement to print "Big" (without quotes) if 
the given number is greater than 100. The statement "Number" (without quotes) will be printed 
regardless.
Note: Follow Sample cases for the output format. After printing move the cursor to the next line.*/

#include <iostream>
using namespace std;

int main() {
    // code here
    int n ;
    cin >> n ;
    if(n > 100)
    {
        cout << "Big" << endl ;
    }

        cout << "Number" << endl ;
    

    return 0;
}