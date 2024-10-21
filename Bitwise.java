



public class Bitwise {

    /*
    public static void main(String[] args) ->This is for swapping
    {
      int a=10, b=15;

      a=a^b;
      b=a^b;
      a=a^b;

      System.out.println(a+ " "+b);
    }
    //


    /*
    public static void main(String[] args)
    {
      byte a=9, b=12;->This is for masking(a and b are right and left four bits of a decimal number)

      byte c;

      c=(byte)(a<<4);->(right side 4 bits are taken to left side)
      c=(byte)(c|b);->(this is for checking)

      System.out.println((c&0b11110000)>>4);->(this is will give 9)
      System.out.println((c&0b00001111)>>4);->(this will give 12)

    }
    */


    public static void main(String[] args)
    {


        byte c;

        c=(byte)(9<<4);
        c=(byte)(c|12);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111)>>4);

    }
}