import java.util.*;
class Threads implements Runnable
{
String name;
Thread t;
public Threads(String name)
{
this.name = name;
t = new Thread(this,name);
System.out.println("New Thread :"+ t);
}
public void run()
{
try
{
for (int i=1;i<=10;i++)
{System.out.println(this.name + " : "+i);
Thread.sleep(500);
}
}
catch (InterruptedException e)
{
System.out.println(this.name + " Interrupted!");
}
System.out.println(this.name+" is Exiting!!!!");
}
}
class Thread1
{
public static void main(String[] args)
{
Thread t1 = new Thread(new Threads("first :-"));
t1.setPriority(Thread.MIN_PRIORITY);
Thread t2 = new Thread(new Threads("second :-"));
t2.setPriority(t1.getPriority());
Thread t3 = new Thread(new Threads("third :-"));
t3.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
}
}
