import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String temp = s.replaceAll("[^a-zA-Z]+" ," ").trim();

        if (temp.isEmpty()) {
            System.out.println("0");
        } else {
            String[] tokensFromTheString = temp.split(" ");
            System.out.println(tokensFromTheString.length);
            for (String token : tokensFromTheString) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}

