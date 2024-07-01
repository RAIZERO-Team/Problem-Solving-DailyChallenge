// Author: Karol Hany

#include <iostream>

using namespace std;


int main() {
 

    int n, fib = 0;
    int num1, num2;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        if (i == 1) {
            cout << 0 << " ";
            num1 = 0;
        }

        if (i == 2) {
            cout << 1 << " ";
            num2 = 1;
        }
        if (i > 2) {
            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            cout << fib << " ";
        }
    }

    
}
