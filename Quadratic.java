import java.lang.*;
import java.util.*;
class Quadratic
{
    public static void main(String args[])
    {
        int a,b,c;
        double r1,r2;
        System.out.println("Enter the values of a,b,c:");
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=b+Math.sqrt((b*b)-(4*a*c)/(2*a));
        r2=b-Math.sqrt((b*b)-(4*a*c)/(2*a));
        System.out.println("Enter the value of r1:"+r1);
        System.out.println("Enter the value of r2:"+r2);

    }
}