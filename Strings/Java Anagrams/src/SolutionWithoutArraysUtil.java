import java.util.*;

public class SolutionWithoutArraysUtil {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }

        char[] aCharArray = a.toUpperCase().toCharArray();
        char[] bCharArray = b.toUpperCase().toCharArray();


        int[] hashArrayThroughASCII = new int[26];
        for(char x: aCharArray){
            hashArrayThroughASCII[x-'A']++;
        }
        for(char x: bCharArray){
            hashArrayThroughASCII[x-'A']--;
        }
        for(int x: hashArrayThroughASCII) {
            if(x!=0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
