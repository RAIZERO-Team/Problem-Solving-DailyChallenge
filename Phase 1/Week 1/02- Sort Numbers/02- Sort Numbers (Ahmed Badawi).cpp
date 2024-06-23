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
void solve(ll n1, ll n2, ll n3){
  ll arr[3] = {n1, n2, n3};

  sort(arr, arr+3);

  for (ll i = 0; i < 3; i++)
  {
    cout<<arr[i]<<"\n";
  }

  cout<<"\n"<<n1<<"\n"<<n2<<"\n"<<n3;
}

int main(){
  fast_perfomance();
  ll num1,num2,num3;
  cin>>num1>>num2>>num3;
  solve(num1,num2,num3);
}