/*Given a positive integer n, determine whether it is odd or even. 
Return true if the number is even and false if the number is odd.*/

#include <iostream>
using namespace std;
class Solution {
  public:
    bool isEven(int n) {
        // code here
        if (n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};