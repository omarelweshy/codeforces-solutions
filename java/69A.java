/*
http://codeforces.com/contest/69/problem/A
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0, y = 0, z = 0;

        for(int i = 0;i < n; i++)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            x= x+a;
            y= y+b;
            z= z+c;
        }
        if( x == 0 && y == 0 && z == 0) System.out.println("YES");
        else System.out.println("NO");

    }
}
