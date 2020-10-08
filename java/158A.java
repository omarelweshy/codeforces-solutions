/*
http://codeforces.com/contest/158/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        int last = arr[k-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= last && arr[i] > 0) result++;
        }
        System.out.println(result);
    }
}
