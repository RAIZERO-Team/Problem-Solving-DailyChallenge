// Author: Mohamed Abolyazeed

#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
  string text;
  string arr[100006];
  int index = 0;

  while (cin >> text)
  {
    reverse(text.begin(), text.end());
    arr[index] = text;
    index++;
  }

  for (int i = 0; i < index; i++)
  {
    cout << arr[i];
    if (i != index - 1)
    {
      cout << " ";
    }
  }
  cout << endl;

  return 0;
}