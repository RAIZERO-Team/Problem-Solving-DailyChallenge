// Author: Mohamed Abolyazeed
#include <iostream>
#include <string>
using namespace std;

int main()
{
  int n;
  cin >> n;
  for (int i = 0; i < n; i++)
  {
    string result;
    cin >> result;
    if (result.length() > 10)
    {
      cout << result[0] << result.length() - 2 << result[result.length() - 1] << endl;
    }
    else
    {
      cout << result << endl;
    }
  }
  return 0;
}