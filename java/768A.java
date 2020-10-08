/*
http://codeforces.com/contest/768/problem/A
*/


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int result = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 1; i < n-1; i++){
            if (arr[0] < arr[i] && arr[i] < arr[n-1]) result++;
        }
        System.out.println(result);
    }
}
