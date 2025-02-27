import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scanner.nextInt();
        System.out.println(Fact(num));
        scanner.close();

    }
    public static int Fact(int num){
        int fact =1;
      for(int i=1; i<=num; i++){
        fact*=i;
    }
           return fact ;
    
    }
}
