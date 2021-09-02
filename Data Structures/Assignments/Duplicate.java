import java.util.*;

public class Duplicate{

    public static void main(String[] args) 
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+ n +" elements ");
        for( i=0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        
         System.out.println("Duplicate Numbers in this array: ");  
         
        for(i = 0; i < a.length; i++) {  
            for(j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }
       
  }  
       
}