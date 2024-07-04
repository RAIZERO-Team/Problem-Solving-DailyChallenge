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

void solve(ii num1, ii num2){
  ii count = 0;
  while (true){
    num1*=3;
    num2*=2;
    count++;
  if (num1 > num2){
      cout<<count;
      break;
    }
  }
  
}

int main(){
  fast_perfomance();
  ii n1,n2;
  cin>>n1>>n2;
  solve(n1,n2);
}