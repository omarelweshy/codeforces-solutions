/*
http://codeforces.com/contest/296/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        boolean valid = true;

        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    c++;
            }
            if (n < 2*c-1){
                valid = false;
                break;
            }
        }
        if (valid) System.out.println("YES");
        else System.out.println("NO");
    }
}
http://codeforces.com/contest/296/problem/A
