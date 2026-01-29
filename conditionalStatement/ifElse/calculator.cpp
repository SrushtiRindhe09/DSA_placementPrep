#include <iostream>
using namespace std;

int main()
{

    int num1, num2;
    char op;
    cout << "Enter num1 and num2: ";
    cin >> num1 >> num2;
    cout << "Enter operator(+, -, *, /): ";
     cin >> op;
    if (op == '+')
    {
        cout << "Addition is: "<< num1 + num2;;
    }
     else if (op == '-')
    {
        cout << "Subtration is: "<< num1 - num2;;
    }
     if (op == '*')
    {
        cout << "Multiplication is: "<< num1 * num2;;
    }
     if (op == '/')
    {
        if(num2 !=0)
        {
            cout << "Division is: "<< num1 /num2;
        }
        else
        {
            cout << "Error: Cannot divided by zero: ";
        }
        
    }
}