import java.util.Scanner;
class NumberToWordsExample{
    static void numToWords(char num[]){
        int len=num.length;
        if(len==0){
            System.out.println("String is empty");
            return;
        }
        if(len>4){
            System.out.println("The number is more than 4 digits");
            return;
        }
        String[] oneDigit=new String[]{"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] twoDigits=new String[]{"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] multiplesOfTens=new String[]{"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
        String[] poweOfTens=new String[]{"Hundred","Thousand"};
        System.out.print(String.valueOf(num)+": ");
        if(len==1){
            System.out.print(oneDigit[num[0]-'0']);
        }
        int x=0;
        while(x<num.length){
            if(len>=3){
                if(num[x]-'0'!='0'){
                    System.out.print(oneDigit[num[x]-'0']+ " ");
                    System.out.print(poweOfTens[len-3]+ " ");
                }
                --len;
            }
            else{
                if(num[x]-'0'==1){
                    int sum=num[x]-'0' +num[x+1]-'0';
                    System.out.println(twoDigits[sum]);
                    return;
                }
                else if(num[x]-'0'==2 && num[x+1]-'0'==0){
                    System.out.println("Twenty");
                    return;
                }
                else{
                    int i=num[x]-'0';
                    if(i>0){
                        System.out.print(multiplesOfTens[i] +" ");
                    }
                    else{
                        System.err.println("");
                    }
                    ++x;

                    if(num[x]-'0'!=0){
                        System.out.println(oneDigit[num[x]-'0']);
                    }
                }
            }

        ++x;    
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of minimum 4 digits: ");
        String input=scanner.nextLine();
        numToWords(input.toCharArray());
        scanner.close();

    }
}