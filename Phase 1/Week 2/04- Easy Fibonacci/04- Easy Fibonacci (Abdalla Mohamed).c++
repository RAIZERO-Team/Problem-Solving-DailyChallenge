// Author: Abdalla Mohammed

#include <iostream>

using namespace std;

int main()
{


int n,f1=0,f2=1,fib;
cin>>n;
for(int i=1;i<=n;i++){
    if(i==1){
    	cout<<f1<<" ";
      continue;
	}
	 else if(i==2){
    	cout<<f2<<" ";
    	continue;
	}
	else {
    fib=f1+f2;
    f1=f2;
    f2=fib;
    cout<<fib<<" ";
}
}
    return 0;
}
