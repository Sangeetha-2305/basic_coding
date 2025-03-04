package TCS_NQT_Basic_Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Non_Repeating_Character {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.next();
        System.out.println(nonRepeatingCharacter(inputString));
        scannerObject.close();
    }
    // input -> saai
    public static char nonRepeatingCharacter(String string) {
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0 ; i < string.length() ; i++) {
            if(linkedHashMap.containsKey(string.charAt(i))) {
                int value = linkedHashMap.get(string.charAt(i));
                linkedHashMap.put(string.charAt(i), (++value));
            } else {
                linkedHashMap.put(string.charAt(i), 1);
            }
        }
        // System.out.println(linkedHashMap);
        for(Map.Entry<Character, Integer> iterator : linkedHashMap.entrySet()) {
            if(iterator.getValue() == 1) {
                return iterator.getKey();
            }
        }
        return '$';
    }
    // Time -> O(N)
    // Space -> 0(N)
}

// HashMap functionality -> {Key, Value}, 0(1), does not allow duplicates, unordered
// LinkedHashMap functionality -> {Key, Value}, 0(1), does not allow duplicates, ordered
// <'s', 1> 
// <'a', 2>
// <'i', 1>