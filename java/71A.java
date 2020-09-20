/*
http://codeforces.com/contest/71/problem/A
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int c=0;
        String s;
        int t = input.nextInt();

        for(int i=0;i<t;i++)
        {
            s=input.next();
            if(s.length()>10)
            {
                c=s.length()-2;
                System.out.print(s.charAt(0) + c + s.charAt(s.length()-1));
                System.out.print(c);
                System.out.println(s.charAt(s.length()-1));
            }
            else System.out.println(s);
        }
    }
}
