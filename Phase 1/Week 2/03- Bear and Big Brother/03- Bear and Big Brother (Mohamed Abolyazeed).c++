// Author: Mohamed Abolyazeed.
#include <iostream>
using namespace std;

int main()
{
  int num1, num2, years = 0;
  cin >> num1 >> num2;

  while (true)
  {
    if (num1 > num2)
    {
      break;
    }
    num1 *= 3;
    num2 *= 2;
    years++;
  }

  cout << years;
  return 0;
}
