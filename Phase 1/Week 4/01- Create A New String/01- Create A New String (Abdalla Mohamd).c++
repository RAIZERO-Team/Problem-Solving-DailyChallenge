// Author:Abdalla Mohamed
#include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    int c_of_s=0,c_of_t=0;
    string s,t;
    cin>>s>>t;
    for(int i=0;i<s.size();i++)
    {
          c_of_s++;
    }
   for(int i=0;i<t.size();i++)
    {
           c_of_t++;
    }
       cout<<c_of_s<<" "<<c_of_t<<endl;
       cout<<s<<" "<<t<<endl;

    return 0;

}
