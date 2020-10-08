/*
http://codeforces.com/contest/520/problem/A
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        String str = input.next();
       for (char ch = 'a'; ch <= 'z'; ch++){
           if (str.toLowerCase().contains(String.valueOf(ch)))
               result++;
       }
       if (result == 26) System.out.println("YES");
       else System.out.println("NO");
    }
}
