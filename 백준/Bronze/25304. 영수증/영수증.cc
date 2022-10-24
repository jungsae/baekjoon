#include <iostream>
#include <vector>
using namespace std;

int main() {
    int total, amount;
    int acc = 0;
    
    cin >> total >> amount;

    for (int i = 0; i < amount; i++)
    {   
        int price, amount;
        cin >> price >> amount;
        acc += price * amount;
    }
    
    cout << (acc == total? "Yes" : "No");

    return 0;
}