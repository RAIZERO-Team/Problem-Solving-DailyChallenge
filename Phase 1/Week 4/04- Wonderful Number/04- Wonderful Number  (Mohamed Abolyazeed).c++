// Author Mohamed Abolyazeed

using namespace std;
#include <iostream>
#include <math.h>
#include <string>
#include <algorithm>

bool isPalindrom(string text)
{
  string rev = text;

  reverse(rev.begin(), rev.end());

  return text == rev;
}

string getBinary(int n)
{
  string binary = "";
  while (n > 0)
  {
    if (n % 2)
      binary.push_back('1');
    else
      binary.push_back('0');

    n /= 2;
  }
  reverse(binary.begin(), binary.end());
  return binary;
}

int main()
{
  int n;
  cin >> n;

  if (n % 2 == 0) // check if n is even
    cout << "NO\n";
  else
  {
    string binary = getBinary(n);

    if (isPalindrom(binary))
      cout << "YES\n";
    else
      cout << "NO\n";
  }

  return 0;
}