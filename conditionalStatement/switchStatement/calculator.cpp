#include <iostream>
using namespace std;

int main()
{
  int a, b, c, ch;
  cout << "Enter the value of first number:";
  cin >> a;
  cout << "Enter the value of second number:";
  cin >> b;
  cout << "Enter your choice"<< endl;
    cout << "1. Addition\n";
    cout << "2. Subtraction\n";
    cout << "3. Multiplication\n";
    cout << "4. Division\n";
    cout << "Enter your choice: ";
  cin >> ch;

  switch(ch)
  {
    case 1:
        c = a+b;
        cout << "Addition is:" << c << endl;
        break;
    case 2:
        c = a-b;
        cout << "Subtraction is:" << c << endl;
        break;
    case 3:
        c = a*b;
        cout << "Multiplication is:" << c << endl;
        break;
    case 4:
    if(b==0)
    {
        cout <<"Division by zero not allowed"<< endl;
    }
    else
    {
         c = a/b;
        cout << "Division is:" << c << endl;
    }
        break;
    default:
        cout << "Invalid Input" << endl;
        break;
  }



}

/*Output:
Enter the value of first number:10
Enter the value of second number:0 
Enter your choice
1. Addition
2. Subtraction
3. Multiplication
4. Division
Enter your choice: 4
Division by zero not allowed
*/