/*
http://codeforces.com/contest/298/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char[] foot = input.next().toCharArray();

        int first = 0; int last = 0;

        for (int i = 0; i < n; ++i) {
            if (foot[i] != '.'){
                first = i;
                break;
            }
        }
        for (int i = n-1; i >= 0; --i) {
            if (foot[i] != '.'){
                last = i;
                break;
            }
        }

        if (foot[first] == 'R' && foot[last] == 'R')
            System.out.println((first+1) + " " + (last+2));
        else if (foot[first] == 'L' && foot[last] == 'L')
            System.out.println((last+1) + " " + (first-1+1));
        else if (foot[first] == 'R' && foot[last] == 'L'){
            for (int i = first; i < n; ++i) {
                last = i;
                if (foot[i] == 'L') break;
            }
            System.out.println((first+1) + " " + (last-1+1));
        }
    }
}
