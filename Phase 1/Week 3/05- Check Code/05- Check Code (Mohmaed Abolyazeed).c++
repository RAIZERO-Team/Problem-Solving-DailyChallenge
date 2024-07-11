// Author Abolyazeed
#include <iostream>
#include <string>
using namespace std;

int main()
{
  int num1, num2;
  cin >> num1 >> num2;

  string text;
  cin >> text;

  int s = text.size();

  if (s != num1 + num2 + 1 || text[num1] != '-')
  {
    cout << "No" << endl;
    return 0;
  }

  for (int i = 0; i < s; i++)
  {
    if (i != num1 && (text[i] < '0' || text[i] > '9'))
    {
      cout << "No" << endl;
      return 0;
    }
  }

  cout << "Yes" << endl;
  return 0;
}
