
// Author: Karol Hany
//new branch Phase1/Week2
#include <iostream>
using namespace std;

int main() {
	//odd even positive negative
	int n , odd = 0, even = 0, positive = 0, negative = 0;
	cin >> n;
	while (n--) {

		int num;
		cin >> num;
		if (num > 0 && num != 0) {
			positive++;
		}
		else if (num < 0 && num != 0) {
			negative++;
		}

		if (num % 2 == 0) {
			even++;
		}
		else {
			odd++;
		}

	}

	cout << "Even: " << even << "\n";
	cout << "Odd: " << odd << "\n";
	cout << "Positive: " << positive << "\n";
	cout << "Negative: " << negative << "\n";

}