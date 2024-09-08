import java.util.Scanner;
public class EvilNumber {
    public static boolean isEvilNumber(int n){
        String binaryString=Integer.toBinaryString(n);
        int countofones=0;
        for(char c:binaryString.toCharArray()){
            if(c=='1'){
                countofones++;
            }
        
        }
        return countofones%2==0;
    }
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sx.nextInt();
        if(isEvilNumber(num)){
            System.out.println("The number is evil number");
        }
        else{
            System.out.println("he number is not evil number");
        }
        sx.close();

    }
    
}
