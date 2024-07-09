// Author Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int num;
  cin >> num;

  string text;
  cin >> text;

  int ans = 0;

  for (size_t i = 0; i < text.length() - 1; i++)
  {
    if (text[i] == text[i + 1])
    {
      ans++;
    }
  }

  cout << ans << "\n";
  return 0;
}
