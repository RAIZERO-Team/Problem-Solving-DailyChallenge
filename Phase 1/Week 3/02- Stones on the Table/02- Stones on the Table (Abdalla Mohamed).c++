// Author: Abdalla Mohamed

#include <iostream>
#include<algorithm>
using namespace std;

int main()
{
    int n,counnt=0;
    cin>>n;
    bool f=0;
    char a[n];
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    for(int i=0; i<n; i++)
    {
        if(a[i]==a[i+1])
        {
            counnt++;
            f=1;
        }
    }
    if(f==1)
    {
        cout<<counnt<<endl;
    }
    else
    {
        cout<<"0"<<endl;
    }


    return 0;
}
