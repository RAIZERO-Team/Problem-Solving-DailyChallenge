// Author: Mohamed Abolyazeed
#include <iostream>
#include <string>

using namespace std;

int main()
{
  int x;
  cin >> x;

  while (x--)
  {
    string text;
    cin >> text;

    int s = text.size();
    bool flag = false;

    for (int i = 0; i < s - 2; i++)
    {
      if (text[i] == '1' && text[i + 1] == '0' && text[i + 2] == '1')
      {
        cout << "Good\n";
        flag = true;
        break;
      }
      if (text[i] == '0' && text[i + 1] == '1' && text[i + 2] == '0')
      {
        cout << "Good\n";
        flag = true;
        break;
      }
    }

    if (!flag)
    {
      cout << "Bad\n";
    }
  }

  return 0;
}
