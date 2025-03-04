import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString1 = scannerObject.next();
        String inputString2 = scannerObject.next();
        System.out.println(isAnagramEfficient(inputString1, inputString2));
        scannerObject.close();
    }

    // public static boolean isAnagram(String string1, String string2) {
    //     if(string1.length() != string2.length())
    //         return false;
    //     char[] arr1 = string1.toCharArray(); // san => ['s', 'a', 'n']
    //     char[] arr2 = string2.toCharArray(); // nas => ['n', 'a', 'a'] 
    //     Arrays.sort(arr1); // [a n s]
    //     Arrays.sort(arr2); // [a i s]
    //     for(int i = 0 ; i < string1.length() ; i++) {
    //         if(!(arr1[i] == arr2[i])) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isAnagramEfficient(String string1, String string2) {
        if(string1.length() != string2.length()) 
            return false;
        int[] frequencyArray = new int[26];
        for(int i = 0 ; i < string1.length() ; i++) {
            frequencyArray[(int) string1.charAt(i) - 97]++;
            frequencyArray[(int) string2.charAt(i) - 97]--;
        }
        for(int i : frequencyArray) {
            if(i != 0) 
                return false;
        }
        return true;
    }
}
