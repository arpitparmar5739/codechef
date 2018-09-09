#include <iostream>
using namespace std;

void canElephantsBeHappy(int n, int c)
{
    int sum = 0, temp = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        sum += temp;
    }

    if (sum <= c)
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
}

int main()
{
    int T;
    cin >> T;

    while (T--)
    {
        int n, c;
        cin >> n >> c;
        canElephantsBeHappy(n, c);
    }

    return 0;
}