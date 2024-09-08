import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter Third number: ");
        int c=sc.nextInt();
        int smallestnumber=(a<b)?(a<c?a:c):(b<c?b:c);
        System.out.println("smallest Number is= "+smallestnumber);
        sc.close();
    }
    
    
}
