import java.util.*;

class Factorial1 {
    public static void main(String[] args) {
		int i =1, n , fact = 1;

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
		n = sc.nextInt();
		

		while  (i <= n)
		{
			fact = fact * i;
			i++;
		}
        System.out.println(" The Factorial value of the given number is :" + fact);
	}
}