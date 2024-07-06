// Author: Karol Hany

#include <iostream>
using namespace std;
int main()
{
   
	int n;
	cin >> n;
	int arr[n];
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
    int num , flag = 0;
    cin>>num;
    for(int i=0 ; i<n ; i++){
      if(arr[i]==num){
          cout<<i<<"\n";
          flag=1;
          break;
      }
   }
   if(flag==0){
      cout<<"-1"<<"\n";
   }
}

