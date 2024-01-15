class Pattern{
    public static void main (String args[])
    {
        for(int i=1;i<=6;i++)//i th row
        {
            for(int j=1;j<=i;j++)//column
            {
            System.out.print(j+" ");//if you want * then("*" +" ")
            }
            System.out.println("");
        }
        
    }
}