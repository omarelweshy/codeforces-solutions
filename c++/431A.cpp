/*
http://codeforces.com/contest/431/problem/A
*/

#include<iostream>
#include <cmath>
#include <algorithm>
#include <cctype> 
#include <string.h>
#include <stdio.h>
#include <cstring>
char str[100010];
 
using namespace std;
int main() {
    int a1=0, a2=0, a3=0, a4=0, ans=0;
    cin >> a1 >> a2 >> a3 >> a4;
    cin >> str;
    int n = strlen(str);
    for (int i = 0; i < n; i++)
    {
        if (str[i] == '1') ans+=a1;
        if (str[i] == '2') ans+=a2;
        if (str[i] == '3') ans+=a3;
        if (str[i] == '4') ans+=a4;       
    }
    cout << ans << endl;    
}
