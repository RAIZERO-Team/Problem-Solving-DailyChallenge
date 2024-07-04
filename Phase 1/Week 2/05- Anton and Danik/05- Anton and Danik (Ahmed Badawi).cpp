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


void solve(ii num , ss s){
  ii countA = 0 , countB = 0;

  for (int i = 0; i < num; i++)
  {
    if (s[i] == 'A'){
      countA++;
    } else {
      countB++;
    }
  }

  if (countA > countB) {
    cout << "Anton";
  } else if (countB > countA){
    cout<< "Danik";
  } else {
    cout << "Friendship";
  }
}

int main(){
  fast_perfomance();
  ii n;
  ss s;
  cin>>n>>s;
  solve(n,s);
}