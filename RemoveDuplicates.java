package TCS_NQT_Basic_Questions;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        System.out.println(removeDuplicates(inputString));
        scannerObject.close();
    }
    // saai -> sai
    
    public static String removeDuplicates(String string) {
        // TIME -> O(N), SPACE -> O(N)
        HashSet<Character> hashSet = new HashSet<>();
        StringBuffer distinctCharacters = new StringBuffer(string);
        for(int i = 0 ; i < distinctCharacters.length() ; i++) {
            if(!hashSet.contains(distinctCharacters.charAt(i))) {
                hashSet.add(distinctCharacters.charAt(i));
            } else {
                distinctCharacters.deleteCharAt(i);
            }
        }
        return distinctCharacters.toString();
    }

}
// HashSet -> Does not allow duplicates, unordered, 0(1) 

// saai -> sai



// TIME -> O(N*N) -> 8 // i / p - stringlength(1000)
// for(int i = 0 ; i < string.length() - 1 ; i++) {
        //     for(int j = (i + 1) ; j < string.length() ; j++) {
        //         if(string.charAt(i) == string.charAt(j)) {
        //             // add the single character to new array...
        //             i++;
        //             break;
        //         }
        //     }
        // }