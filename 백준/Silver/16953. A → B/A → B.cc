#include <iostream>
using namespace std;

int main() {
    int a, b, acc;
    cin >> a >> b;
    acc = 1;

    while (a != b) {
        acc++;
        int check = b;

        if (b % 10 == 1)
            b = b / 10;
        else if (b % 2 == 0) 
            b /= 2;
        
        if (check == b) {
            cout << "-1" << endl;
            return 0;
        }
    }

    cout << acc << endl;
    return 0;
}
