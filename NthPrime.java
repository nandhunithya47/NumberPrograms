import java.util.Scanner;
class NthPrime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static int findPrime(int n){
        int count=0;
        int numbers=1;
        while(count<n){
            numbers++;
            if(isPrime(numbers)){
                count++;
            }
           
        }
        return numbers;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int nthprimenum=findPrime(num);
        System.out.println("nth prime number is: "+nthprimenum);
        sc.close();
    }
}