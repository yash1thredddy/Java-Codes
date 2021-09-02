import java.util.Scanner;
public class Syncronize{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter  number that you want : ");
int n = sc.nextInt();
Printer obj = new Printer();
Prime t1=new Prime(obj,n);
Composite t2=new Composite(obj,n);
t1.start();
t2.start();
}
}
class Printer{
synchronized void print(int n,int ch){
for(int i=2;i<n+1;i++){
boolean flag=true;
for(int j=2;j<i;j++){if(i%j==0){
flag=false;
break;
}
}
switch(ch){
case 1: if(flag)
System.out.println("Prime : "+i);
break;
case 2: if (!flag)
System.out.println("Composite : "+i);
break;
}
try{Thread.sleep(10);}catch(Exception e){}
}
}
}
class Prime extends Thread{
Printer t;
int n;
Prime(Printer t,int n){
this.t=t;
this.n=n;
}
public void run(){
t.print(n,1);
}
}
class Composite extends Thread{
Printer t;
int n;
Composite(Printer t,int n){
this.t=t;
this.n=n;
}
public void run(){
t.print(n,2);
}
}
