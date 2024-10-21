class Book
{
String BKName;
int BKID;
String BKAuthor;
Book(String name,int id,String author)
{
this.BKName=name;
this.BKId=id;
this.BKAuthor=author;
}
BKUpdateDetails(String name,int id,String author)
{
this.BKName=name;
this.BKID=id;
this.BKAUthor=author;
}
BKDisplay()
{
System.out.println("The name of book:"+name);
System.out.println("The id of book is"+id);
System.out.println("The author of book"+author);
}
class BookDemo()
{
public static void main(String Args[])
Book book=new Book(Goodbook,12344,steve);
book.BKDisplay();
BKUpdateDetails(badbook,8493,dyler)
System.out.println("The Updated details of the book:")
book.BKDisplay()


