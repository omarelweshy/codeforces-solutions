/*
http://codeforces.com/contest/682/problem/A
FOR REMEMBER NOT MY CODE
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long result=0;

        for(long i=1;i<=n;i++)
            result = result + (m+i)/5 - i/5;
        System.out.println(result);
    }
}

