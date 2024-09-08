import java.util.Scanner;
public class ATM {
    private static double balance=1000.0;
    public static void menu(){
        System.out.println("ATM Menu");
        System.out.println("1:Check balance");
        System.out.println("2:Deposit Amount");
        System.out.println("3:Withdraw Amount");
        System.out.println("4:Exit");
        System.out.println("Enter the choice");
        
    }
    public static void checkBalance(){
        System.out.println("The balance is" +balance);
    }
    public static void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully Deposited rupees "+amount);
            System.out.println("The new balance is "+ balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public static void Withdraw(double amount){
        if(amount<=balance &&amount>0){
            balance-=amount;
            System.out.println("Successfully withdrawn rupees "+amount);
            System.out.println("The new balance is "+balance);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        double amount;
        while(true){
            menu();
            choice =sc.nextInt();
            switch(choice){
                case 1:
                checkBalance();
                break;
                case 2:
                System.out.println("Enter deposit amount");
                amount=sc.nextDouble();
                deposit(amount);
                break;
                case 3:
                System.out.println("Enter the withdrawal amount: ");
                amount=sc.nextDouble();
                Withdraw(amount);
                break;
                case 4:
                System.out.println("Thank you for using ATM, Good bye ");
                sc.close();
                System.exit(0);
                default:
                System.out.println("Invalid Entry");

            }
            System.out.println();
        }
    }
    
}
