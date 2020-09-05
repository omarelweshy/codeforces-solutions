/*
http://codeforces.com/contest/677/problem/A
*/

#include<iostream>
#include <cmath>
#include <algorithm>
#include <cctype> 
 
using namespace std;
 
int main()
{
    long n, h, result = 0; cin >> n >> h;
    for (int i = 0; i < n; i++)
    {
        int x; cin >> x;
        if (x > h)
            result += 2;
        else 
            ++result;
    }
    cout << result << '\n';
    
}
