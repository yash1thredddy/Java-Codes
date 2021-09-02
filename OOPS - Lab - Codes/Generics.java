import java.util.*;
public class Generics <A_1,A_2,A_3>{
A_1 a_1;
A_2 a_2;
A_3 a_3;
Generics(A_1 a_1,A_2 a_2,A_3 a_3){
this.a_1 = a_1;
this.a_2 = a_2;
this.a_3 = a_3;
}
public <A_1,A_2,A_3> void Display() {
System.out.println(this.a_1+" "+this.a_2+" "+this.a_3);
}
public static void main(String[] args) {
Generics<Integer,Integer,String> c1 = new Generics<Integer, Integer,
String>(18, 10861, "Virat");
c1.Display();
Generics<String,Integer,Integer> c2 = new
Generics<String,Integer,Integer>("Sachin",10,18426);
c2.Display();
Generics<Integer,String,Integer> c3 = new
Generics<Integer,String,Integer>(7, "Dohni", 10534);
c3.Display();
Generics<Integer,Integer,String> c4 = new Generics<Integer, Integer,
String>(10201, 333, "Gayle");
c4.Display();
Generics<String,Integer,Integer> c5 = new
Generics<String,Integer,Integer>("ABD",9577,17);
c5.Display();
}
}
