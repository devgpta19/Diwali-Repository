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