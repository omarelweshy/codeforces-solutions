/*
http://codeforces.com/contest/766/problem/A
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();

        if (a.equals(b))
            System.out.println(-1);
        else System.out.println(Math.max(a.length(), b.length()));
        }
}
