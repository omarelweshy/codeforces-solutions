/*
https://codeforces.com/contest/799/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            n = number of cakes needed
            t = time to bake k cake
            k = baked cakes
            d = time to build second oven
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), t = input.nextInt();
        int k = input.nextInt(), d = input.nextInt();
        int timer = 0, cakes = 0, loops = 0;

        while (cakes < n){
            timer += t; cakes += k;
            if (timer > d)
                ++loops;
        }
        if (loops > 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
