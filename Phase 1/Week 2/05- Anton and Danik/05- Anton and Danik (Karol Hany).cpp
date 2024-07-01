// Author: Karol Hany

#include <iostream>
using namespace std;
int main()
{
    int n,Anton=0 , Danik=0;
    cin >> n;
	while (n--)
	{
		char ch;
		cin >> ch;
		if (ch == 'A') {
			Anton++;
		}
		else
		{
			Danik++;
		}

	}
	if (Anton > Danik) {
		cout << "Anton";
	}
	else if (Danik > Anton) {
		cout << "Danik";
	}
	else {
		cout << "Friendship";
	}
}

