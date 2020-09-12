/*
http://codeforces.com/contest/709/problem/A
*/

/*
first line
    n = number of oranges 
    b = juicer size
    d = waste section size
second line
    oranges size
 */
 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), b = input.nextInt(),d = input.nextInt();
        int result = 0,waste = 0;
        while (n-- >= 1) {
            int k = input.nextInt();
            if (k > b) {
                continue;
            } else {
                waste += k;
                if (waste > d){
                    ++result;
                    waste = 0;
                }
            }
        }
        System.out.println(result);
    }
}
