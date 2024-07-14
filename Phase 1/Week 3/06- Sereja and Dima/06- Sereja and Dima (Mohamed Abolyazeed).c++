// Author: Mohamed Abolyazeed

#include <iostream>
#include <vector>
using namespace std;

int main()
{
  int n;
  cin >> n;

  int *arr = new int[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  int start = 0;
  int end = n - 1;
  int player1 = 0;
  int player2 = 0;
  int max_val = 0;
  int play = 0;

  while (start <= end)
  {
    if (arr[start] >= arr[end])
    {
      max_val = arr[start];
      start++;
    }
    else
    {
      max_val = arr[end];
      end--;
    }

    if (play % 2 == 0)
    {
      player1 += max_val;
    }
    else
    {
      player2 += max_val;
    }
    play++;
  }

  cout << player1 << " " << player2 << endl;

  return 0;
}
