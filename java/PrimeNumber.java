import java.util.Scanner;
 class PrimeNumber {//it divisble by 1 and itself
    public static void main(String args[])
    {
        int i,n,a=0;//i for loop,n for user,a for logic
        System.out.println("Enter a number:");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        for(i=2;i<=n-1;i++)//n=13,you check 2 to 12 so n-1=13-1--upto 12
        //1 and 13 is divi by 1 & itself
        {
            if(n%2==0)//14%2==0
            {
                a=a+1;//a=0+1==1//now a=1
            }
        }
        if(a>0)
        {
            System.out.println("No is not prime number");
        }
        else
        {
            System.out.println("its is prime number");
        }
        s1.close();
    
        

    }
    
}
