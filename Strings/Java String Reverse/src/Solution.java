import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] aToArray = A.toCharArray();
        for (int i = 0; i <= aToArray.length/2; ) {
            if (aToArray[i] == aToArray[aToArray.length - 1 - i]) {
                i++;
                if (i >= aToArray.length / 2-1) {
                    System.out.println("Yes");
                    break;
                }
            }
             else {
                System.out.println("No");
                break;
            }
        }
    }
}
