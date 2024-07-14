// Author: Abdalla Mohamed

#include <iostream>
#include<algorithm>
#include<string>
using namespace std;
int main()
{
    int A,B;
    cin>>A>>B;
    string s;cin>>s;
    int f=0;
     for(int i=0;i<s.size();i++)
   {
      if(s[i]!='-')
        f++;
   }
      if(s[A]=='-'&&f==A+B)
      {
          cout<<"Yes"<<endl;
      }
      else
      {
          cout<<"No";
      }

    return 0;
}
