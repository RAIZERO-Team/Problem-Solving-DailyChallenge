#include <iostream>

using namespace std;

int main()
{

    int n,A=0,D=0;cin>>n;
    char a[n];
    for(int i=1;i<=n;i++)
    {
       cin>>a[i];
       if(a[i]=='A')
       {
           A++;
       }
       else if(a[i]=='D')
       {
           D++;
       }
    }

    if(A>D)
    {
        cout<<"Anton";
    }
    else if(A<D)
    {
        cout<<"Danik";
    }
    else
    {
        cout<<"Friendship";
    }

    return 0;
}
