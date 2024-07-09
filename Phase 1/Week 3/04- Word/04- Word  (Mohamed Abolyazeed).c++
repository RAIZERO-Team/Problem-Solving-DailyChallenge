// Author Abolyazeed
#include <iostream>
#include <cctype>
using namespace std;

int main()
{
  string text;
  cin >> text;
  int small = 0, capital = 0;
  for (int i = 0; i < text.size(); i++)
  {
    if (islower(text[i]))
    {
      small++;
    }
    else
    {
      capital++;
    }
  }

  if (small > capital)
  {
    for (int i = 0; i < text.size(); i++)
    {
      text[i] = tolower(text[i]);
    }
  }
  else if (capital > small)
  {
    for (int i = 0; i < text.size(); i++)
    {
      text[i] = toupper(text[i]);
    }
  }
  else
  {
    for (int i = 0; i < text.size(); i++)
    {
      text[i] = tolower(text[i]);
    }
  }

  cout << text << endl;
  return 0;
}