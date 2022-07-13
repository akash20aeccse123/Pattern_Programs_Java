/*
Enter n: 5
    *
   **
  ***
 ****
*****

*/
import java.util.*;
class P5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int row=1;
		while(row<=n)
		{
			int col=1;
			while(col<=space)
			{
				System.out.print(" ");
				col=col+1;
			}
			int cst=1;
			while(cst<=star)
			{
				System.out.print("*");
				cst++;
			}
            System.out.print("\n");
            space--;
            star++;
            row++;			
		}
	}
}