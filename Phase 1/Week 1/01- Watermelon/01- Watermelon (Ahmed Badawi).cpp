// Author: Ahmed Badawi

#include <iostream>
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
  // #ifndef ONLINE_JUDGE
  //   freopen("input.txt", "r", stdin), freopen("output.txt", "w", stdout); 
  // #endif
}

// function to solve the problem
void solve(int num){
  if(num % 2 == 0 && num != 2){
    cout<<"YES";
    return;
  }
  cout<<"NO";
}

int main(){
  fast_perfomance();
  int n;
  cin>>n;
  solve(n);
}