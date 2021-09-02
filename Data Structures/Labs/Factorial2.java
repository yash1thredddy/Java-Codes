import java.util.*;

class Factorial2 {
    public static void main(String[] args) {
		int i =1, n , fact = 1;

		Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
		n = in.nextInt();
		

		for (i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
        System.out.println(" The Factorial value of the given number is : " + fact);
        
	}
}