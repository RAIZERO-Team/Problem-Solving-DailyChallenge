// Author: Karol Hany

#include <iostream>
using namespace std;

int main() {

    //"+" => 43
    //"-" => 45
    //"X" => 88

    int n;
    int res = 0;
    cin >> n;

    while (n--)
    {
        string str;
        cin >> str;
        int cont_pls = 0;
        int cont_min = 0;
        

        for (int i = 0; i < 3; i++)
        {
            if (str[i] == 88) {
                continue;
            }
            else {
                if (str[i] == 43) {
                    cont_pls++;
                    if (cont_pls == 2) {
                        res += 1;
                    }
                }
                else {
                    if (str[i] == 45) {
                        cont_min++;
                        if (cont_min == 2) {
                            res -= 1;
                        }
                    }
                }

            }
        }


    }

    cout << res;

}