// Author: Mohamed Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int N;
  cin >> N;

  int even = 0, odd = 0, positive = 0, negative = 0;
  for (int i = 0; i < N; ++i)
  {
    int num;
    cin >> num;

    if (num % 2 == 0)
    {
      even++;
    }
    else
    {
      odd++;
    }

    if (num > 0)
    {
      positive++;
    }
    else if (num < 0)
    {
      negative++;
    }
  }

  cout << "Even: " << even << endl;
  cout << "Odd: " << odd << endl;
  cout << "Positive: " << positive << endl;
  cout << "Negative: " << negative << endl;

  return 0;
}