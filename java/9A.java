/*
http://codeforces.com/contest/9/problem/A
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] array = new String[]{"1/6","1/3","1/2","2/3","5/6","1/1"};
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        x = Math.max(x, y);
        System.out.println(array[6-x]);

    }
}
