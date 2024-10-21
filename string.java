import java.util.Scanner;
class stringReverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        string str=sc.next();
        str.reversestring();
        str.checkString();
    }
    static String reverseString(String str)
    {
        char[] charArray=str.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while(left<right)
        {
            temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;

        }
        return new String(charArray);

    }
    static void checkReverse(String original,String reversed)
    {
      if(original.equals(reversed))
      {
        System.out.println("The string is reversed");

      }
      else
      {
        System.out.println("The string is not reversed");
      }
    }
}