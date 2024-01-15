//153=351(not)
//121=121(palindrome)
//logics-n=121(user)-sum=0,rem,a
//rem=n%10=121%10=1        //rem=12%10=2      //rem=1%10=1
//sum=(sum*10)+rem=0+1=1   //sum=(1*10)+2=12  //sum=(12*10)+1=121
//n=n/10=121/10=12         //n=12/10=1        //n=1/10=0 now n is 0 but n=121 so we use copy var that a=n
//here sum==n-->121=121
import java .util.Scanner;
class palindrome{
    public static void main(String args[]) {
        int r,reverse=0,a,n;
        System.out.println("Enter a Number :");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        a=n;//n=0 so copy var to store n=121
        while(n>0){//n>0 becoz when n=0 i get sum=121 so it
            r=n%10;
            reverse=(reverse*10)+r;//sum=0 
            n=n/10;
        }
        if(a==reverse)
        {
            System.out.println("its Palindrome Number ");
        }
        else
        {
            System.out.println("Not a Palindrome Number"); 
        }
        s1.close();
            
    }
}    

 