class Sem1
{
    int m11,m12,m13,m14,avg1;
    Sem1()
    {
        m11=95;
        m12=93;
        m13=88;
        m14=90;
        avg1=(m11+m12+m13+m14)/4;
    }
}
class Sem2 extends Sem1
{
    int m21,m22,m23,m24,avg2;
    Sem2()
 	{
	   m21=89;
	   m22=98;
	   m23=97;
	   m24=79;
	   avg2=(m21+m22+m23+m24)/4;
 	}
}
class Sem3 extends Sem2
{
    int m31,m32,m33,m34,avg3;
    Sem3()
    {
        m31=87;
        m32=78;
        m33=88;
        m34=96;
        avg3=(m31+m32+m33+m34)/4;
    }

}

class Sem4 extends Sem3
{
    int m41,m42,m43,m44,avg4;
    Sem4()
    {
        m41=79;
        m42=90;
        m43=77;
        m44=96;
        avg4=(m41+m42+m43+m44)/4;
    }
    int totatavg()
    {
        return (avg1+avg2+avg3+avg4)/4;

    }
}
class MultipleInheritance
{
    public static void main(String args[])
    {
        Sem4 s4=new Sem4();
        System.out.println("semester 1 avg"+s4.avg1);
        System.out.println("semester 2 avg"+s4.avg2);
        System.out.println("semester 3 avg"+s4.avg3);
        System.out.println("semester 4 avg"+s4.avg4);
        System.out.println("total average   "+s4.totatavg());

    }
}
