import util.Scanner.*;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        string str=sc.next();
        if (str.matches("[o1]+")) {
            Sstem.out.println("The number is radix");
        }
        else if(str.matches("[o-7]+"))
        {
            System.out.println("The number is octal");
        }
        else if(str.matches("[0-9]"))
        {
            System.out.println("It is decimal");
        }
        else if(str.matches("[0-9A-Z]"))
        {
            System.out.println("It is hexadecimal");
        }
    }
}