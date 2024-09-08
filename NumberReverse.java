import java.util.Scanner;
public class NumberReverse {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
            

        }
        System.out.println("reversed number is: "+sum);
        scanner.close();
    }
}
