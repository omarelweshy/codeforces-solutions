/*
http://codeforces.com/contest/228/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int result = 0;
        if (s1 == s2 || s1 == s3 || s1 == s4) ++result;
        if (s2 == s3 || s2 == s4 ) ++result;
        if (s3 == s4) ++result;
        System.out.println(result);
    }
}
