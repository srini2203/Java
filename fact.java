import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        int fact=0;
        System.out.println("Enter value of n:");
        int n=nextint();
        for(int i=0;i<=n;i++)
        {
            fact=fact*n;
            System.out.println("The factorial is:"+fact);
        }
    }
}
