/*
https://codeforces.com/contest/47/problem/B
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            String x = input.next();
            if(x.charAt(1)=='>'){
                if(x.charAt(0)=='A') a++;
                else if(x.charAt(0)=='B') b++;
                else if(x.charAt(0)=='C') c++;
            }
            if(x.charAt(1)=='<'){
                if(x.charAt(2)=='A') a++;
                else if(x.charAt(2)=='B') b++;
                else if(x.charAt(2)=='C') c++;
            }
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(a);
        x.add(b);
        x.add(c);
        if(x.contains(2)&&x.contains(1)&&x.contains(0)){

            String res = "";
            if(a==0) res += "A";
            if(b==0) res += "B";
            if(c==0) res += "C";

            if(a==1) res += "A";
            if(b==1) res += "B";
            if(c==1) res += "C";

            if(a==2) res += "A";
            if(b==2) res += "B";
            if(c==2) res += "C";
            System.out.println(res);
        }
        else System.out.println("Impossible");
    }
}
