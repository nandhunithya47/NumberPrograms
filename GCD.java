import java.util.Scanner;
public class GCD {
    public static int gcd(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2, num1%num2);
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int findgcd=gcd(a,b);
        System.out.println("The Greatest Common factor is" +findgcd);
        sc.close();
    }
    
}
