//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.*;
import java.util.*;
class Area
{
    public static void main(String args[])
    {
        System.out.println("Enter the Base of triangle:");
        System.out.println("Enter the height of triangle");
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int Area=(base*height)/2;
        System.out.println("Enter the area of triangle:"+Area);



    }
}