import java.util.Scanner;
class Factorial{
    public static void main(String args[])
    {
        int f=1,i,n;//f for logic,i for loop,n for user input
        System.out.println("Enter the number");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        for(i=1;i<n+1;i++)//n=5//i<=n is also choice
        {
            f=f*i;//f=1*1==1   //fact=n*fact(n-1) recursive logic used in fact
                  //f=1*2==2
                  //f=2*3==6
                  //f=6*4==24
                  //f=24*5==120 finally loop 6 not incr,<n+1 s0
        }
        System.out.println("the factorial of a number "+n+" is "+f);
        s1.close();
    }
}
    

