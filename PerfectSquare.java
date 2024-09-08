import java.util.Scanner;
public class PerfectSquare {
    public static boolean ps(int num){
        if(num<0){
            return false;
        }
        int sqrt=(int)Math.sqrt(num);
        return sqrt*sqrt==num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int n=sc.nextInt();
        if(ps(n)){
            System.out.println(n+" is a Perfecr square");
        }
        else{
            System.out.println("Not a perfect sqaure");
        }
        sc.close();
    }
    
}
