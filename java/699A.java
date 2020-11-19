/*
https://codeforces.com/contest/699/problem/A
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        char[] s = input.next().toCharArray();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (s[i-1] == 'R' && s[i] == 'L'){
                int time = arr[i] - arr[i-1];
                time /= 2;
                min = Math.min(min, time);
            }
        }
        if (min == Integer.MAX_VALUE)
            min = -1;
        System.out.println(min);
    }
}

