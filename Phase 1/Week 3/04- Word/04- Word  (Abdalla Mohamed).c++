// Author: Abdalla Mohamed

#include <iostream>
#include<algorithm>
#include <string>
#include<math.h>
using namespace std;
int main()
{
    string n;int lower=0,upper=0;;
    cin>>n;
    for(int i=0;i< n.length();i++)
    {
        if(n[i]>='a'&&n[i]<='z')
        {
         lower++;
        }
        else
        {
            upper++;
        }
    }

    if(lower>=upper)
    {
        for(int i=0;i< n.length();i++)
        {
            if(n[i]>='A'&&n[i]<='Z')
            {
                 n[i]+=32;
            }
        }

    }
    else
    {
         for(int i=0;i< n.length();i++)
        {
            if(n[i]>='a'&&n[i]<='z')
            {
                 n[i]-=32;
            }
        }
    }
        cout<<n;






    return 0;
}



