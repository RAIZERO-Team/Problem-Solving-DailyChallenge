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
  for (int i = 0; i < size - 1; i++)
  {
    int index = i;
    int myValue = arr[i];
    for (int j = i + 1; j < size; j++)
    {
      if (arr[j] < myValue)
      {
        index = j;
        myValue = arr[j];
      }
    }
    int temp = arr[i];
    arr[i] = myValue;
    arr[index] = temp;
  }
  for (int i = 0; i < size; i++)
  {
    cout << arr[i] << ' ';
  }

  return 0;
}