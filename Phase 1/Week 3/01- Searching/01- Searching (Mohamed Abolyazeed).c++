// Author Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int size;
  cin >> size;
  int arr[size];

  for (int i = 0; i < size; i++)
  {
    cin >> arr[i];
  }

  int search;
  cin >> search;
  int flag = 0;

  for (int i = 0; i < size; i++)
  {
    if (arr[i] == search)
    {
      cout << i << endl;
      flag = 1;
      break;
    }
  }

  if (flag == 0)
  {
    cout << -1 << endl;
  }

  return 0;
}