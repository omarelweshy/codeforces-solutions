/*
http://codeforces.com/contest/680/problem/B
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int[] t = new int[n + 1];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            t[i] = input.nextInt();
            result += t[i];
        }
        for (int i = 1; i < a && i <= n - a; i++) {
            if (t[a + i] + t[a - i] == 1)
                result--;

        }
        System.out.println(result);
    }
}
