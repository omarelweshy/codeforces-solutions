/*
http://codeforces.com/contest/282/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int result = 0;
        while (--n >= 0){
            String s = input.next();
            if (s.charAt(1) == '+') result++;
            else result--;
        }
        System.out.println(result);
    }
}
