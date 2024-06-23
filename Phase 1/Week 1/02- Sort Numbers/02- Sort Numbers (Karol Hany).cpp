    //Author: Karol Hany
    
    #include <iostream>
    #include <algorithm>
     
    using namespace std;
     
    int main()
    {
       int num1 , num2 , num3 ;
       cin>>num1>>num2>>num3;
       if( num1>=num2&&num1>=num3&&num2<=num3)
       {
       cout<<num2 <<'\n'<< num3<<'\n'<< num1<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
       }
      else if( num2>=num3&&num2>=num1&&num1<=num3)
      {
       cout<<num1 <<'\n'<< num3<<'\n'<< num2<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
      else if( num3>=num2&&num3>=num1&&num2<=num1)
      {
       cout<<num2 <<'\n'<< num1<<'\n'<< num3<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
      else if( num1>=num2&&num1>=num3&&num2>=num3)
      {
       cout<<num3 <<'\n'<< num2<<'\n'<< num1<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
      else if( num2>=num3&&num2>=num1&&num1>=num3)
      {
       cout<<num3 <<'\n'<< num1<<'\n'<< num2<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
      else if( num3>=num2&&num3>=num1&&num2>=num1)
      {
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
      else if( num1==num2&&num1<=num3)
      {
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
      }
       else if( num2==num3&&num2<=num1)
       {
       cout<<num2 <<'\n'<< num3<<'\n'<< num1<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
       }
       else
       {
       cout<<num1 <<'\n'<< num3<<'\n'<< num2<<endl;
       cout<<endl;
       cout<<num1 <<'\n'<< num2<<'\n'<< num3<<endl;
       }
     
      // or with array 
          int  n1 , n2 , n3;
          cin>>n1>>n2>>n3;
           
           int arr[3] = {n1 , n2 , n3};
         
           sort(arr,arr+3);
 
            for(int i=0 ; i<3; i++){
                cout<<arr[i]<<"\n";
            }
        
           cout<<"\n";

          cout<<n1<<"\n"<<n2<<"\n"<<n3<<"\n";

    }