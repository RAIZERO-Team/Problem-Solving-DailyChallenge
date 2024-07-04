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

int main(){
  fast_perfomance();
  ii n;
  cin>>n;
  ii arr[n];
  for(int i=0;i<n;i++){
    cin>>arr[i];
  }

  int even = 0, odd = 0, positive = 0, negative = 0;
  for(int i=0;i<n;i++){
    if (arr[i] % 2 == 0){
      even++;
    } else {
      odd++;
    }
  
    if (arr[i] > 0){
      positive++;
    } else if (arr[i] < 0){
      negative++;
    }
  }
  
  cout<< "Even: "<<even<<"\n"
      << "Odd: "<<odd<<"\n"
      << "Positive: "<<positive<<"\n"
      << "Negative: "<<negative<<"\n";
}