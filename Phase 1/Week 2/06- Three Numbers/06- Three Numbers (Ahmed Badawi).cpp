// Author: Ahmed Badawi

#include <iostream>
#include <algorithm>
using namespace std;

#define ii int
#define ll long long
#define ss string
#define dd double
#define ff float
#define in_arr  for(long long i=0 ;i<num ; i++){cin>>arr[i];}
#define in_num_arr ll num ; cin>>num;ll arr[num]; in_arr;
#define out_arr  for(long long i=0 ; i<num ; i++){cout<<arr[i]<<" ";}
#define out_revers_arr  for(long long i=num-1 ; i>=0 ; i--){cout<<arr[i]<<" ";}

void fast_perfomance(){
  ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
}

void solve(ii k , ii s){
  ii Z, count = 0;

  for (int X = 0; X <= k; X++) {
      for (int Y = 0; Y <= k; Y++) {
          Z = s - X - Y;
          if (Z >= 0 && Z <= k) {
              count++;
          }
      }
  }
  cout<< count;
}

int main(){
  fast_perfomance();
  ii K,S;
  cin>>K>>S;
  solve(K,S);
}