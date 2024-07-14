 // Author : Abdalla Mohamed 
 #include <iostream>
#include<algorithm>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    string Magnets,new_magnets;
    int counnt=0;
    for (int i=0; i<n; i++)
    {
        cin >>Magnets;
        if (Magnets!=new_magnets)
        {
            counnt++;
        }
        new_magnets=Magnets;
    }
    cout<<counnt<<endl;

    return 0;

}
