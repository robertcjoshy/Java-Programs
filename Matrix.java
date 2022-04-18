import java.util.*;
class Matrix
{
 	public static void main(String args[])
 	{
 	 	Scanner s=new Scanner(System.in);
 	 	int a[][]=new int[4][4];
 	 	int b[][]=new int[4][4];
 	 	int i,j;
 	 	System.out.println("ENTER 1st MATRIX\n");
 	 	for(i=0;i<4;i++)
 	 	{
 	 		for(j=0;j<4;j++)
 	 		{
 	 		 a[i][j]=s.nextInt();
 	 		}
 	 	}
 	 	System.out.println("ENTER 2nd MATRIX\n");	 	
 	 	for(i=0;i<4;i++)
 	 	{
 	 		for(j=0;j<4;j++)
 	 		{
 	 		 b[i][j]=s.nextInt();
 	 		}
 	 	}
 	 	System.out.println("1st MATRIX\n");
 	 	for(i=0;i<4;i++)
 	 	{
 	 		for(j=0;j<4;j++)
 	 		{
 	 		 	System.out.print(a[i][j]+" ");
 	 		}
 	 		System.out.println();
 	 	}
 	 	System.out.println("2nd MATRIX\n");	 	
 	 	for(i=0;i<4;i++)
 	 	{
 	 		for(j=0;j<4;j++)
 	 		{
 	 		 	System.out.print(b[i][j]+" ");
 	 		}
 	 		System.out.println();
 	 	}
 	 	System.out.println("SUM MATRIX\n");	 	
 	 	for(i=0;i<4;i++)
 	 	{
 	 		for(j=0;j<4;j++)
 	 		{
 	 		 	System.out.print(b[i][j]+a[i][j]+" ");
 	 		}
 	 		System.out.println();
 	 	}
 	 		
 	 }
} 	 

