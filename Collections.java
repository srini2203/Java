import.java.util.*
class Point implements Comparable<double>{
double x;
double y;
Point(){
this.x=0.0;
this.y=0.0;
}
Point(double x,double y){
this.x=x;
this.y=y;
}
Point(Point otherPoint){
this.x=otherPoint.x;
this.y=otherPoint.y;
}
public double find_distance(double x,double y){
return Math.sqrt(Math.pow(x-this.x),2)+Math.pow((y-this.y),2));
}
public double find_distance(Point otherPoint){
find_distance(otherPoint.x,otherPoint.y);
}
public compareTo(Point otherPoint){
double Thisdistance=find_distance(0.0);
double Otherdistance=find_Distance(0.0);
 return Compre(Thisdistance,Otherdistance);
}
void disp(){
cout<<"(x,y)";
}
 
public static void main(String[] args){
int n=10;
set <Point> pointhashset=new Hashset<Point>();
for(i=0;i<n;i++){
Point point=new Point(Math.random()*10,Math.random()*10)
pointhashset.(addPoint);
}
List<Point> sortedset=new ArrayList<Point>(pointhashset);
Collections.sort(sortedset);
System.out.println("The ordered list is:");
{
 for(Point point:sortedpoints){
 point.disp();
}
}
}
