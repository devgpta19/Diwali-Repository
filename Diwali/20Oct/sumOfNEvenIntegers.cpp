#include <iostream>
using namespace std;

int main(){
    int num;
    cout<<"Enter a Number\n";
    cin>>num;
    int n = num/2;
    cout<<"Sum of Even No. till "<<num<<" is "<<(n*(n+1))<<endl;
}