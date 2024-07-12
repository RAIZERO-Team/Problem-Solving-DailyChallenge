// Author: Ahmed Badawi

#include <iostream>
#include <algorithm>
using namespace std;

#define ii int
#define ll long long
#define dd double
#define ff float
#define ss string
#define in_arr  for(long long i=0 ;i<num ; i++){cin>>arr[i];}
#define in_num_arr ll num ; cin>>num;ll arr[num]; in_arr;
#define out_arr  for(long long i=0 ; i<num ; i++){cout<<arr[i]<<" ";}
#define out_revers_arr  for(long long i=num-1 ; i>=0 ; i--){cout<<arr[i]<<" ";}

void fast_perfomance(){
  ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
}

// function to solve the problem
void solve(ii tc){
  ss word;
  ii count;

  while(tc--){
  cin>>word;
  count = 0;
// if the word is strictly more than 10 characters
  if (word.length() > 10){
    for(ii i=0;i < word.length();i++){
      count++;
    }
    cout<<word.front()<<count-2<<word.back()<<"\n";
  } else{
    cout<<word<<"\n";
  }
  }
}

int main(){
  fast_perfomance();
  ii testcasees;
  cin>>testcasees;
  solve(testcasees);
}
