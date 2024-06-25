// Author: Mohamed Abolyazeed
#include <iostream>
using namespace std;

int main()
{
  int num1, num2, num3;
  cin >> num1 >> num2 >> num3;
  int max, def, min;
  if (num1 >= num2 && num1 >= num3)
  {
    max = num1;
    if (num2 >= num3)
    {
      def = num2;
      min = num3;
    }
    else
    {
      def = num3;
      min = num2;
    }
  }
  else if (num2 >= num1 && num2 >= num3)
  {
    max = num2;
    if (num1 >= num3)
    {
      def = num1;
      min = num3;
    }
    else
    {
      def = num3;
      min = num1;
    }
  }
  else
  {
    max = num3;
    if (num1 >= num2)
    {
      def = num1;
      min = num2;
    }
    else
    {
      def = num2;
      min = num1;
    }
  }
  cout << min << "\n"
       << def << "\n"
       << max << endl;
  cout << endl;
  cout << num1 << "\n"
       << num2 << "\n"
       << num3 << endl;
  return 0;
}

/*
#include <iostream>
#include <algorithm>

int main()
{
  int A, B, C;
  std::cin >> A >> B >> C;

  int arr1[3] = {A, B, C};

  int arr2[3] = {A, B, C};
  std::sort(arr1, arr2 + 3);

  for (int i = 0; i < 3; ++i)
  {
    std::cout << arr2[i] << std::endl;
  }

  std::cout << std::endl;

  for (int i = 0; i < 3; ++i)
  {
    std::cout << arr1[i] << std::endl;
  }

  return 0;
}

*/