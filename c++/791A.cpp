/*
http://codeforces.com/contest/791/problem/A
*/

#include<iostream>
#include <cmath>
#include <algorithm>
#include <cctype> 
 
using namespace std;
 
int main()
{
	int a, b; cin >> a >> b;
	int res = 0;
	while ( a <= b)
	{
		a *=3; b *=2;
		res++;
	}
 
	cout << res << endl;
}
