//Multilevel Inheritance

//Create a Class Sem1
class Sem1{
  int a1,b1,c1,d1,avg1;
  //constructer for Sem1
  Sem1()
  {
    a1=46;
    b1=42;
    c1=43;
    d1=40;

     avg1=(a1+b1+c1+d1)/4;
  }
}
//Extend Sem1 to Sem2 CLass
class Sem2 extends Sem1{
  int a2,b2,c2,d2,avg2;
//constructer for Sem2
  Sem2()
  {
    a2=38;
    b2=42;
    c2=48;
    d2=45;

    avg2=(a2+b2+c2+d2)/4;

  }
}
//Extend Sem2 to Sem3 CLass
class Sem3 extends Sem2{
  int a3,b3,c3,d3,avg3;
//constructer for Sem3
  Sem3()
  {
    a3=41;
    b3=39;
    c3=42;
    d3=46;

    avg3=(a3+b3+c3+d3)/4;
  }
}
//Extend Sem3 to Sem4 CLass
class Sem4 extends Sem3{
  int a4,b4,c4,d4,avg4;

  Sem4()
  {
    a4=40;
    b4=36;
    c4=37;
    d4=43;

    avg4=(a4+b4+c4+d4)/4;
  }
  int totalavg()
  {
    return (avg1+avg2+avg3+avg4)/4;
  }
}
//Main Class
class Semester
{
  public static void main(String... args)
  {
    Sem4 t = new Sem4();

    System.out.println("Semester 1 Average Marks: "+t.avg1);
    System.out.println("Semester 2 Average Marks: "+t.avg2);
    System.out.println("Semester 3 Average Marks: "+t.avg3);
    System.out.println("Semester 4 Average Marks: "+t.avg4);

    System.out.println("Total Four Semesters Average Marks:"+t.totalavg());
  }
}
