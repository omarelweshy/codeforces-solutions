/*
https://codeforces.com/contest/143/problem/A
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r1 = input.nextInt(); int r2 = input.nextInt();
        int c1 = input.nextInt(); int c2 = input.nextInt();
        int d1 = input.nextInt(); int d2 = input.nextInt();
        int a, b, c, d;
        for (int i = 1; i < 10; i++){
            a = i;
            for (int j = 1; j < 10; j++){
                b = j;
                for (int k = 1; k < 10; k++){
                    c = k;
                    for (int l = 1; l < 10; l++){
                        d = l;
                        if (a != b && a !=c && a != d && b != c && b != d && c != d){
                            if (a + b == r1 && c + d == r2 && a + c == c1 && b + d == c2 && a + d == d1 && b + c == d2){
                                System.out.println(a + " " + b);
                                System.out.println(c + " " + d);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("-1");
    }
}


