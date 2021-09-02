import java.util.*;
class Transpose
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int c = sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int i,j;
        System.out.println("Enter Numbers to fill " +r+ " Rows and  " +c+ " Columns in matrix to Transpose");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The actual matrix before Transpose is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
				b[j][i]=a[i][j];
			}
		System.out.println(" ");	
		}
		System.out.println("Transpose Matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println(" ");
		}
		
	}
}