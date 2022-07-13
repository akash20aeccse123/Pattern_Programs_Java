/*
input: 5
output:
       * * * * *
       * * * * *
       * * * * *
       * * * * *
       * * * * *

*/
import java.util.*;
class P2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int star=n;
		int row=1;
		while(row<=n)
		{
			int col=1;
			while(col<=star)
			{
				System.out.print("*"+" ");
				col=col+1;
			}
			System.out.print("\n");
			row=row+1;
		}
	}
}