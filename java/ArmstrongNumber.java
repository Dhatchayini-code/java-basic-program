//153=(1)3+(5)3+(3)3=1+125+27=153
//re=n%10=153%10=3       //rem=15%10=5     //rem=1%10=1
//sum=sum+rem3=0+(3)3=27 //sum=27+(5)3=152 //sum=152+(1)3=153
//n=n/10=153/10=15       //n=15/10=1       //n=1/10=0.1 where int so 0
// n=0 but user n=153 so copy of n var to "a"
import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String args[]) {
        int n,r,sum=0,a;
        System.out.println("Enter a number :");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        a=n;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(a==sum)
        {
            System.out.println("its an ArmstrongNumber");
        }
        else
        {
            System.out.println("ts not ArmstrongNumber");
        }
    
        

        
        
    }
}