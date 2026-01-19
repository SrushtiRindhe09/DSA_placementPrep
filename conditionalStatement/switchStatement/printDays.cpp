/* take a day as a input, 
for 1 print monday, 
for 2 print tuesday and so on till 7 */

#include <iostream>
using namespace std;

int main()
{
    int day;
    cin >> day;
    switch(day)
    {
        case 1:
            cout << "Sunday" << endl;
            break;
        case 2:
            cout << "Monday" << endl;
            break;
        case 3:
            cout << "Tuesday" << endl;
            break;
        case 4:
            cout << "Wednesday" << endl;
            break;
        case 5:
            cout << "Thursday" << endl;
            break;
        case 6:
            cout << "Friday" << endl;
            break;
        case 7:
            cout << "Saturday" << endl; 
            break; 
        default:
        cout << "Invalid Input" << endl;      
        
    }

}

/*Output:
2
Monday
*/