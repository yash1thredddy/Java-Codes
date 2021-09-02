import java.util.*;

class Factorial {

    public static int fact1(int n){
        
        int i =1, fact = 1;
		do
		{
			fact = fact * i;
			
			i++;
		}while (i<=n);

        return fact;
    }
   
    public static int fact2(int n){
        int i =1,fact = 1;
		for (i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
        return fact;
    }
    public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
		int n = sc.nextInt();
        if (n==0){
            System.out.println("Number is 0");
        }
        else{
        System.out.println(" The Factorial value of the "+n+" using Do While is : " + fact1(n));
        System.out.println(" ");
       System.out.println(" The Factorial value of the "+n+" using For Loop is : " + fact2(n));
        }
	}
}