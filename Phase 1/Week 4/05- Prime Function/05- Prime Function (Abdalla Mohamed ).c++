//Auhtor : Abdalla Mohamed
#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
void prime(int num)
{

    bool f=0;
  for(int i=2; i*i<=num; i++){
     if(num%i==0)
    {
        cout<<"NO"<<endl;
        f=1;
        break;
    }
  }
     if(f==0)
     {
         cout<<"YES"<<endl;

     }
    }

int main()
{
    int x,num;
    cin>>x;
    while(x--)
    {
    cin>>num;
    if(num==1)
    {
        cout<<"NO"<<endl;
        continue;
    }

        prime(num);
    }


    return 0;
}

