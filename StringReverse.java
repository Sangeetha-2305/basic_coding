package TCS_NQT_Basic_Questions;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String input = scannerObject.nextLine();  // Sangeetha -> ahteegnas
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = (input.length() - 1) ; i > -1 ; i--) {
            stringBuffer.append(input.charAt(i));
        }
        System.out.println(stringBuffer);
        scannerObject.close();
    }
}
