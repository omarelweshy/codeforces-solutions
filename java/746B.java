/*
http://codeforces.com/contest/746/problem/B
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();
        StringBuffer out = new StringBuffer();
        out.append(str.charAt(0));

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                out.append(str.charAt(i));
            else
                out.insert(0, str.charAt(i));
        }
 
        if (n % 2 == 0)
            System.out.println(out.reverse());
        else
            System.out.println(out);
    }
}

