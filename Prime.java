import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter the number:");
        int num= scanner.nextInt();
        if(isPrime(num))
        {
           System.out.println(num +"is a prime number");
        }
        else{
            System.out.println(num +"is not a prime number");
        }
        
        
        
        
    }
    public static boolean isPrime(int n){
        if(n<=1)
        {
            return false;
        }
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
           
        }
        return true;
    }
}
