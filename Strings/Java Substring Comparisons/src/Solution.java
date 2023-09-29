import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
                //there is A PROBLEM on HackerRank: you can`t edit nothing above these lines =
                // can`t add import java.util.ArrayList; import java.util.Comparator;
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i+k <= s.length(); i++) {
            substrings.add(s.substring(i, i+k));
        }

        substrings.sort(Comparator.naturalOrder());

        smallest = substrings.get(0);
        largest = substrings.get(substrings.size()-1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}