package Inputs_in_package;

import java.util.Scanner;

public class BasicsOfInput {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        // input section
        String input = scannerObject.next();
        String charArr[] = input.split(","); //[1,2,3,4,5] = 1,2,3,4,5
        int[] arr = new int[charArr.length];
        for(int i = 0 ; i < charArr.length ; i++) {
            // arr[i] = (int) charArr[i]; -> error
            arr[i] = Integer.parseInt(charArr[i]);
        }
        //method section
        int additionOfAllNumber = sumOfArray(arr);
        // output section
        System.out.println(additionOfAllNumber);
        scannerObject.close();
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for(int i : arr) // enhanced for loop
            sum += i; // only works for list elements like array, collections 
            // etc not strings
        return sum;
    }
}
