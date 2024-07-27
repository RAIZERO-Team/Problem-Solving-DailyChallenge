// Auhtor : Abdalla Mohamed
#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    int x;
    cin>>x;
   string n;
   for(int i=0;i<x;i++)
   {
        bool f=0;
        cin>>n;
   for(int i=0;i<n.size();i++)
   {
       if((n[i]=='0'&&n[i+1]=='1'&&n[i+2]=='0')||(n[i]=='1'&&n[i+1]=='0'&&n[i+2]=='1'))
       {
           cout<<"Good"<<endl;
            f=1;
            break;
       }
   }
  if(f==0)
  {
      cout<<"Bad"<<endl;
  }
   }
    return 0;

}
