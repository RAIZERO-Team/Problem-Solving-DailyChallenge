// Author: Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int num1, num2;
  cin >> num1 >> num2;
  int result = 0;

  for (int i = 0; i <= num1; i++)
  {
    for (int j = 0; j <= num1; j++)
    {
      int k = num2 - i - j;
      if (k >= 0 && k <= num1)
      {
        result++;
      }
    }
  }
  cout << result << endl;
  return 0;
}
