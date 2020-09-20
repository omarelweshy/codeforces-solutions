/*
http://codeforces.com/contest/686/problem/A
*/

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); long ice = input.nextLong();
        int distressed = 0;

        for (int i = 0; i < n; i++){
            String status = input.next();
            int d = input.nextInt();

            if (status.equals("+")){
                ice += d;
            } else if (status.equals("-")){
                if (ice < d){
                    distressed += 1;
                } else ice -= d;
            }
        }
        System.out.println(ice + " " + distressed);

    }
}
