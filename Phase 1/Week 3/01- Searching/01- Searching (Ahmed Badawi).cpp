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

void solve(){
  ii n,x;
  cin >> n;
  ii arr[n];

  for (int i = 0; i < n; i++)
  {
    cin>>arr[i];
  }

  cin>>x;

  for (int i = 0; i < n; i++)
  {
    if (arr[i] == x){
      cout<<i;
      break;
    } else if (i == n-1){
      cout << -1;
    }
  }
}

int main(){
  fast_perfomance();
  solve();
}