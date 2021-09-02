//Create Abstract class shape
abstract class Shape
{
String shapeName;
public Shape(String s){
shapeName= "Shape";
shapeName=s;
}
public abstract double area();
public String toString(){
return shapeName;
}
}
//Extend shape to Sphere
class Sphere extends Shape
{
int r;
public Sphere(int radius)
{
  //Use Super Class
super("Sphere");
r = radius;
}
public double area()
{
return 4*Math.PI*r*r;
}
public String toString()
{
return super.toString();
}
}
//Extend Shape to Cylinder
class Cylinder extends Shape
{
int r ,h;
public Cylinder(int radius,int height)
{
super("Cylinder"); //Super Class
r = radius;
h = height;
}
public double area()
{
return 2*Math.PI*r*h+2*Math.PI*r*r;
}
public String toString()
{
return super.toString();
}
}
//Extend SHape to Rectangle
class Rectangle extends Shape
{
int h,w;
public Rectangle(int height,int width)

{
super("Rectangle"); //Super Class
h = height;
w = width;
}
public double area()
{
return h*w;
}
public String toString()
{
return super.toString();
}

}
//Create Class paint
class Paint
{
double coverage;
public Paint(double c)
{
coverage = c;
}
public double amount(Shape s)
{
return s.area()/coverage;
}
}
//Create Main Class PaintThings
public class PaintThings
{
public static void main (String[] args)
{
final double COVERAGE = 350;
Paint paint = new Paint(COVERAGE);
Shape deck = new Rectangle(35,20);
Shape bigBall = new Sphere(15);
Shape tank = new Cylinder(10,30);
double deckAmount, ballAmount, tankAmount;
deckAmount = paint.amount(deck);
ballAmount = paint.amount(bigBall);
tankAmount = paint.amount(tank);

System.out.println ("Amount of paint needed");
System.out.println ("Deck :- " + deckAmount);
System.out.println ("Big Ball :- " + ballAmount);
System.out.println ("Tank :- " + tankAmount);
}
}
