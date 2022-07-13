/*
input: 5
output: 
       *
       * *
       * * *
       * * * *
       * * * * *

*/
import java.util.*;
class P3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int star=1;
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
			star=star+1;
			row=row+1;
		}
	}
}