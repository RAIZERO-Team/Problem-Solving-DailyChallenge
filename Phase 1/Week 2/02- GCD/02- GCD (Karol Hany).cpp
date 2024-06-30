// Author: Karol Hany
// new branch Phase1/Week2

#include <iostream>
using namespace std;

int main() {
     //GCD

    int num1, num2;
    cin >> num1 >> num2;
    if (num1 > num2)swap(num1, num2);
    while (num1 > 0) {
        num2 %= num1;
        swap(num1, num2);
    }
    cout << num2;
}