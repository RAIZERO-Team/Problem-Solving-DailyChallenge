// Author: Ahmed Badawi

#include <iostream>
#include <algorithm>
using namespace std;

#define ii int
#define ll long long
#define dd double
#define ff float
#define in_arr  for(long long i=0 ;i<num ; i++){cin>>arr[i];}
#define in_num_arr ll num ; cin>>num;ll arr[num]; in_arr;
#define out_arr  for(long long i=0 ; i<num ; i++){cout<<arr[i]<<" ";}
#define out_revers_arr  for(long long i=num-1 ; i>=0 ; i--){cout<<arr[i]<<" ";}

void fast_perfomance(){
  ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
}


void fibonacci(ii num){
  ii start = 0 , second = 1;
  if(num == 1){
    cout << 0;
  } else if (num == 2){
    cout<< 0 << " " << 1 << " ";
  } else {
    cout<< 0 << " " << 1 << " ";
    for(int i = 2; i < num; i++){
      int res = start + second;
        cout<<res<<" ";
        start = second;
        second = res;
    }
  }
}

int main(){
  fast_perfomance();
  ii n1;
  cin>>n1;
  fibonacci(n1);
}