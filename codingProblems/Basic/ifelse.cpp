/*You have to take an interger input a, and then use the if statement to print "Big" 
(without quotes) if the given number is greater than 100, and use the else statement 
to print "Number" (without quotes) when the number is smaller than or equal to 100.
Note: After printing the output, you should move the cursor to the new line.*/

#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;

    if (a > 100) {
        cout << "Big" << endl;
    } else {
        cout << "Number" << endl;
    }

    return 0;
}
