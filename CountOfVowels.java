import java.util.Scanner;

public class CountOfVowels {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String inputString = scannerObject.nextLine();
        System.out.println(vowelsCount(inputString));
        scannerObject.close();
    }
    // Sangeetha
    public static int vowelsCount(String inputString) {
        int returningCount = 0, i = -1;        
        while(inputString.indexOf("AEIOUaeiou", (i + 1)) != -1) {
            returningCount += 1;
        }
        return returningCount;
    }
}