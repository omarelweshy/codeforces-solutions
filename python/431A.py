"""
http://codeforces.com/contest/431/problem/A
"""

calories = list(map(int, input().split()))
 
game = input()
 
 
ans = game.count('1') * calories[0] + game.count('2') * calories[1] \
      + game.count('3') * calories[2] + game.count('4') * calories[3]
 
 
print(ans)
