#include <iostream>
#include<algorithm>
#include<string>
using namespace std;
int main()
{
    int k,s,counnt=0;
    cin>>k>>s;
    for(int i=0; i<=k; i++)
    {
        for(int j=0; j<=k; j++)
        {
            int Z=s-i-j;
            if(Z>=0&&Z<=k)
            {
                counnt++;
            }
        }
    }
    cout<<counnt<<endl;

    return 0;
}
