// Author: Abdalla Mohamed
#include <iostream>

using namespace std;

int main()
{
  int n,x;cin>>n;
  bool f=0;
  int arr[n];
  for(int i=0;i<n;i++)
  {
      cin>>arr[i];
  }
  cin>>x;
   for(int i=0;i<n;i++)
  {
    if(x==arr[i])
    {
        cout<<i<<endl;
        f=1;
        break;
    }
  }
 if(f==0)
 {
     cout<<-1<<endl;
 }
    return 0;
}
