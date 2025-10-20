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
        sum = sum +(r*r*r);
        n = n / 10;
    }
    if (sum == num){
        cout<<sum<<" == "<<num<<endl;
        cout << "The Number is Armstrong";
    }
    else
        cout << "The Number is Not Armstrong";
}