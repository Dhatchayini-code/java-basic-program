import java.util.Scanner;
class Fibonnaci{
    public static void main(String args[])
    {
        int first=0,second=1,next,i,number;//next for logic,i for loop,number for user input
        System.out.println("Enter a no of terms:");
        Scanner s1=new Scanner(System.in);
        number=s1.nextInt();
        for(i=0;i<number;i++)
        {
            if(i<=1)//0,1 are fixed so i<=0
            {
                next=i;//store it next variable
            }
            else{
                next=first+second;//0+1=next=1
                first=second;//first=1//first=1//first=2
                second=next;//second=1//second=2//second=3
                //next=f+s=2//next=f+s=3//next=f+s=5.....
            }
            System.out.print(" "+next);//just print it in sameline add with fixed next value which is 0,1
            s1.close();
        }
    }
}
