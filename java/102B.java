/*
http://codeforces.com/contest/102/problem/B
*/

import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
 
        int ret = 0;
        while(s.length() > 1)	{
            s = generate(s);
            ret++;
        }
        System.out.println(ret);
    }
    public static String generate(String s)	{
        int ret = 0;
        for(int i = 0; i < s.length(); i++)
            ret += s.charAt(i)-'0';
        return Integer.toString(ret);
    }
}
