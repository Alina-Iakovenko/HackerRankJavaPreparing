import java.util.Scanner;

public class Solution2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

            // There is a problem on HackerRank in this task: you can`t edit above these comment-lines =
            // you can`t add
            // import java.util.ArrayList;
            // import java.util.Comparator;

            // but it looks like there are problems with auto-tests too

        String[] charactersRows = new String[s.length()-k+1];
        for (int i = 0; i <= s.length()-k; i++) {
            charactersRows[i] = s.substring(i, i+k);
        }

        for (int i = 0; i < charactersRows.length - 1;) {
        String temp;
            if (charactersRows[i].compareToIgnoreCase(charactersRows[i + 1]) > 0) {
                temp = charactersRows[i];
                charactersRows[i] = charactersRows[i + 1];
                charactersRows[i + 1] = temp;
                i=0;
            } else {
                i++;
            }
        }

        smallest = charactersRows[0];
        largest = charactersRows[charactersRows.length-1];
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