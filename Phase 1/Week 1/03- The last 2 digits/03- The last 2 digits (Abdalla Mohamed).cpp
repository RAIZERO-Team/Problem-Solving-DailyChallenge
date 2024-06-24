#include <iostream>
using namespace std;

int main() {


int a,b,c,d;
cin>>a>>b>>c>>d;
int num1=a%100;int num2=b%100;
int num3=c%100;int num4=d%100;
int res = (num1*num2*num3*num4);
    res%=100;
  if(res<=9){
    cout<<"0"<<res<<"\n";
  }
  else{
      cout<<res<<"\n";
  }
    return 0;
}



