// Author: Karol Hany

#include <iostream>

using namespace std;

int main() {
    int k, s, r = 0;
    cin >> k >> s;
    for (int i = 0; i <= k; i++) {
        int z;
        for (int j = 0; j <= k; j++) {
            z = i + j;
            if (s - z >= 0 && s - z <= k) {
                r++;
            }
        }
    }
    cout << r << "\n";
}