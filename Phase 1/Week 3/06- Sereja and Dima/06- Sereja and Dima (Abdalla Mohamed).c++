// Author : Abdalla Mohamed 
#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int cards[n];
    for (int i=0; i<n; i++)
    {
        cin>>cards[i];
    }
    int sereja=0,dima=0,maxx=0;
    int l=0,r=n-1;
    for (int i= 0; l<=r; i++)
    {
        if (cards[l] >= cards[r])
        {
            maxx=cards[l];
            l++;
        }
        else
        {
            maxx=cards[r];
            r--;
        }
            if (i% 2 == 0)
            {
                sereja+= maxx;
            }
            else
            {
                dima+=maxx;
            }
    }

    cout << sereja<<" "<<dima<<endl;
    return 0;
}
