// take an age as a input, and check if you re adult or not
# include <iostream>
using namespace std;

int main()
{
    int age = 23 ;
    cout << "enter your age" << endl ;
    cin >> age ;
    if(age>=18)
    {
        cout << "you are adult" ;
    }
    else
    {
        cout << "you are not adult" ;
    }
    return 0;
}

/*Output
Enter your age: 16
You are not adult
*/