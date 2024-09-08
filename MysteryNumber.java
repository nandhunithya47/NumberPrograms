import java.util.Scanner;
class MysteryNumber{
    public static int mysteryNum(int n){
        int reversed=0;
        while(n>0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        return reversed;    
    }
    public static boolean isMystery(int n){
        for(int i=0;i<n/2;i++){
            int reversed=mysteryNum(i);
            if(i+reversed==n){
                System.out.println(n+"="+i+"+"+reversed);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(isMystery(num)){
            System.out.println("The number is Mystery Number");
        }
        else{
            System.out.println("The number is not a mystery number");
        }
        sc.close();
        }
}