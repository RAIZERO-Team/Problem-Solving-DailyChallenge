// Author: Mohamed Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int num, Anton = 0, Danik = 0;
  cin >> num;

  for (int i = 0; i < num; ++i)
  {
    char ch;
    cin >> ch;
    if (ch == 'A')
    {
      Anton++;
    }
    else if (ch == 'D')
    {
      Danik++;
    }
  }

  if (Anton > Danik)
  {
    cout << "Anton";
  }
  else if (Danik > Anton)
  {
    cout << "Danik";
  }
  else
  {
    cout << "Friendship";
  }

  return 0;
}
