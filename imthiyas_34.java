import java.util.Scanner;

public class Pattern23
{
	// create class for printing "*" star.
	private static void stars(int count)
	{
		for (int i = 0; i < count; ++i)
	    System.out.print("*");
	}
	
	// create class for printing " " space.
	private static void spaces(int count)
	{
	    for (int i = 0; i < count; ++i)
	    System.out.print(" ");
	}
	 
	public static void main(String[] args)
	{
		// initialize and create object.
		int n;
		Scanner s=new Scanner(System.in);
	      
	    // enter number of rows.
	    System.out.print("Enter the number for pattern : ");
	    n=s.nextInt();
	    
	    for (int i = 0; i < n; ++i) 
	    {
	        stars(i + 1);
	        spaces(n - i - 1);
	        stars(n - i + 1);
	        spaces(2 * i);
	        stars(n - i);
	        spaces(n - i - 1);
	        stars(i + 1);
	 
	        System.out.println();
	    }
	}
}
