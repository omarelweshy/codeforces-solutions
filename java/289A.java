/*
https://codeforces.com/contest/289/problem/A
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); int k = input.nextInt();
        int covered = 0;

        for (int i = 0; i < n; i++) {
            int start = input.nextInt();
            int end = input.nextInt();
            covered += ( end - start + 1);

        }
        covered %= k;
        if (covered != 0)
            covered = k -covered;
        System.out.println(covered);
    }
}
