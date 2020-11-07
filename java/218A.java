/*
https://codeforces.com/contest/218/problem/A
*/


import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = 2 * input.nextInt() +1;
        int k = input.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
 
        for (int i = 1; i < n; i += 2)
            if (arr[i] - arr[i - 1] > 1 && arr[i] - arr[i + 1] > 1 && k > 0) {
                arr[i]--; k--;
            }
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
    }
}
