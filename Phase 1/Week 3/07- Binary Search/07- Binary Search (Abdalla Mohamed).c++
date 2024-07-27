  // Author : Abdalla Mohamed  

#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;

bool binarySearch(int arr[], int Size, int Search)
{
    int left = 0;
    int right = Size - 1;
    while (left <= right) {
    int mid = (left+right)/2 ;
        if (arr[mid] == Search)
        {
             return true;
        }

        if (arr[mid] < Search)
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
    int n,num_Search;
    cin>>n>>num_Search;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    sort(arr, arr + n);
    for(int i=0;i<num_Search;i++)
    {

        int x;
        cin>>x;
        if(binarySearch(arr,n,x))
        {
          cout<<"found"<<endl;
        }
        else
        {
          cout<<"not found"<<endl;
        }
}
    return 0;
}
