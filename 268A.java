/*
http://codeforces.com/contest/268/problem/A
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> home = new ArrayList<>();
        ArrayList<Integer> away = new ArrayList<>();
        int result = 0;
        while (n-- >= 1) {
            home.add(sc.nextInt());
            away.add(sc.nextInt());
        }
        for (Integer integer : home)
            for (Integer value : away) {
                if (integer.equals(value))
                    result++;
            }
        System.out.println(result);
    }
}
