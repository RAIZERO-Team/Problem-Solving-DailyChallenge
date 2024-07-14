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

// Print Q1, Q2, Q3, Q4 according to the quarter in which the point belongs to.
// Print "Origem" If the point is at the origin. x = 0, y = 0
// Print "Eixo X" If the point is over X axis.   x = num , y = 0
// Print "Eixo Y" if the point is over Y axis.   x = 0 , y = num

// function to solve the problem
void solve(dd x, dd y){
  if (x == 0 && y == 0) {
    cout<<"Origem";
  } else if (y == 0){
    cout<<"Eixo X";
  } else if (x == 0){
    cout<<"Eixo Y";
  } else if (x > 0 && y > 0){
    cout<<"Q1";
  } else if (x < 0 && y > 0){
    cout<<"Q2";
  } else if (x < 0 && y < 0){
    cout<<"Q3";
  } else {
    cout<<"Q4";
  }
}

int main(){
  fast_perfomance();
  dd X, Y;
  cin>>X>>Y;
  solve(X,Y);
}
