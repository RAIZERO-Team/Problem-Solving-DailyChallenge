// Author: Mohamed Abolyazeed

#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main()
{
  int n;
  cin >> n;

  vector<string> arr(n);
  int counter = 0;
  for (int i = 0; i < n; ++i)
  {
    cin >> arr[i];
    if (i == 0)
    {
      counter++;
    }
    else
    {
      if (arr[i][0] == arr[i - 1].back())
      {
        counter++;
      }
    }
  }
  cout << counter << endl;

  return 0;
}