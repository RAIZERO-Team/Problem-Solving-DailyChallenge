// Author: Mohamed Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int n;
  cin >> n;
  int x = 0;
  for (int i = 0; i < n; i++)
  {
    string result;
    cin >> result;
    if ((result[0] == '+' && result[1] == '+') || (result[0] == 'X' && result[1] == '+'))
    {
      x++;
    }
    else if ((result[0] == '-' && result[1] == '-') || (result[0] == 'X' && result[1] == '-'))
    {
      x--;
    }
  }
  cout << x << endl;
  return 0;
}