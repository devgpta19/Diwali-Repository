// 2. Given an integer n, reverse its digits and return the reversed number. Ignore
// leading zeros in the reversed result.


#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter a Number\n";
    cin >> num;
    int n = num;
    int sum = 0;
    while (n != 0)
    {
        int r = n % 10;
        sum = sum * 10 + r;
        n = n / 10;
    }
        cout << "The Reverse of Number is "<<sum<<endl;
        cout<<sum<<" == "<<num;
}