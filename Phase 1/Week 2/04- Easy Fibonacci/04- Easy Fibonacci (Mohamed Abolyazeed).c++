// Author: Mohamed Abolyazeed.
#include <iostream>
using namespace std;

int main()
{
  int num1;
  cin >> num1;

  int num2 = 0, num3 = 1;

  for (int i = 1; i <= num1; ++i)
  {
    if (i == 1)
    {
      cout << num2;
    }
    else if (i == 2)
    {
      cout << " " << num3;
    }
    else
    {
      int next = num2 + num3;
      cout << " " << next;
      num2 = num3;
      num3 = next;
    }
  }

  cout << endl;
  return 0;
}
