// Author: Karol Hany

#include <iostream>

using namespace std;

int main() {
 

	int num1, num2 , year=0;
	cin >> num1 >> num2;


	while (num1 <= num2)
	{
		num1 *= 3;
		num2 *= 2;
		year++;

	}
	cout << year;
}
