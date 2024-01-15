import java.util.Scanner;
class RiverseString{
    public static void main(String args[]) {
        String s;//fpr user input variable
        System.out.println("enter a string");
        Scanner s1=new Scanner(System.in);
        s=s1.nextLine();
        int len=s.length();//find length
        String rev="";//its used for store the rev string
        for(int i=len-1;i>=0;i--)
        //arr start from 0 so len-1,start from 0,1,..,it rev so --dec
        {
            rev=rev+s.charAt(i);//empty+1(0)---first letter will print
        }
        System.out.println(rev);
        s1.close();//close error so use it this line


    }
}