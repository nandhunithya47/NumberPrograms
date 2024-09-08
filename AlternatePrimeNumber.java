import java.util.Scanner;
public class AlternatePrimeNumber {
    public static boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args ){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the limit"); 
       int limit=sc.nextInt();

       int count=0;
       for(int i=2;i<=limit;i++){
        if(isPrime(i)){
            count++;
            if(count%2==1){
                System.out.println(i +" ");
            }
        }
       }
       sc.close();
    }

    
}
