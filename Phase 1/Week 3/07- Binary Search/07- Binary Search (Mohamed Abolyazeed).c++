// Author: Mohamed Abolyazeed

#include <iostream>
#include <algorithm>
using namespace std;

bool binarySearch(int arr[], int size, int target)
{
  int left = 0;
  int right = size - 1;

  while (left <= right)
  {
    int mid = left + (right - left) / 2;

    if (arr[mid] == target)
    {
      return true;
    }
    if (arr[mid] < target)
    {
      left = mid + 1;
    }
    else
    {
      right = mid - 1;
    }
  }

  return false;
}

int main()
{
  int num1, num2;
  cin >> num1 >> num2;

  int *arr = new int[num1];

  for (int i = 0; i < num1; i++)
  {
    cin >> arr[i];
  }

  sort(arr, arr + num1);

  for (int i = 0; i < num2; i++)
  {
    int target;
    cin >> target;

    if (binarySearch(arr, num1, target))
    {
      cout << "found" << endl;
    }
    else
    {
      cout << "not found" << endl;
    }
  }
  return 0;
}
