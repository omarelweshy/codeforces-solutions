/*
https://codeforces.com/problemset/problem/339/A
*/


import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();

        s = s.replace("+", "");
        char []arr = s.toCharArray();

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");
        }
    }
}
