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

// function to solve the problem
void solve(ii n1, ii n2, ii n3,ii n4){
  ii res = (n1%100)*(n2%100)*(n3%100)*(n4%100);
    if(res % 100 <= 9){
    cout<<"0"<<res % 100<<endl;
  } else {
    cout<<res % 100<<endl;
  }
}

int main(){
  fast_perfomance();
  ii num1,num2,num3,num4;
  cin>>num1>>num2>>num3>>num4;
  solve(num1,num2,num3,num4);
}