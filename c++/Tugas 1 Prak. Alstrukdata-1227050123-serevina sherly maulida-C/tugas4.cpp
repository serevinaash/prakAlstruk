#include <iostream>

using namespace std;

int main() {
    float x, y;
    float P, Q;

    cout << "Masukkan nilai x: ";
    cin >> x;

    cout << "Masukkan nilai y: ";
    cin >> y;

    P = x + y;

    if (P >= 0) {
        Q = x * y;
    } else{
        Q = x / y;
    }
    cout << "Hasil Q : "<<Q;

    return 0;
}