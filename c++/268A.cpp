#include<iostream>
#include <cmath>
#include <algorithm>
#include <cctype> 
#include <string.h>
#include <stdio.h>
#include <cstring>
#include <cstdlib>
using namespace std;
 
int main() {
    int n, ans = 0;
    cin >> n;
    int home[n], guest[n];
 
    for (int i = 0; i < n; i++)
    {
        cin >>  home[i] >> guest[i];        
    }
    for (int i = 0; i < n; i++)
    {
       for (int j = 0; j < n; j++)
       {
           if (home[i] == guest[j]) ans++;
       }
       
    }
    cout << ans << endl;
 
}