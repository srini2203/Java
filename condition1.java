import java.util.Scanner.*;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        string wname=next();
        String protocol= wname.substring(0,wname.indexOf(":"));
        if(protocol="htps")
        {
           System.out.println("VALID");
        }
        string domain=wname.substring(wname.lastIndexOf("."));      //lastIndexOf will take the given thing as starting and will go till end of string
        if(domain="com")
        {
            System.out.println("It is commercial");
        }
    }
}