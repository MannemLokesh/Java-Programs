import java.util.Scanner;

public class Arrays 
{
	public static void main(String loki[]) 
	{
		Scanner sc=new Scanner(System.in);
		// scanning Mat A row and col
		System.out.println("enter row value of mat A");
		int row1=sc.nextInt();
		System.out.println("enter col value of mat A");
		int col1=sc.nextInt();
		int [][]a1= new int[row1][col1];
		
		// scanning Mat B row and col
		System.out.println("enter row value of mat B");
		int row2=sc.nextInt();
		System.out.println("enter col value of mat B");
		int col2=sc.nextInt();
		int [][]a2= new int[row2][col2];
		
		// to check condition row col match
		if(row1==col2 && col1==row2)
		{
			// to read Mat A values
			for(int i=0; i<a1.length;i++)
			{
				for(int j=0; j<a1[i].length;j++)
				{
					System.out.println("enter Mat A values for "
							+i +"th row and "+j+"th col");
					a1[i][j]=sc.nextInt();
					
				}
			}
			
			//to read Mat B values
			for(int i=0; i<a2.length;i++)
			{
				for(int j=0; j<a2[i].length;j++)
				{
					System.out.println("enter Mat B values for "
							+i+ "th row and "+j+"th col");
					
					a2[i][j]=sc.nextInt();
				}
			}
			
			//to calculate mat A and mat B
			for(int i=0; i<a1.length;i++)
			{
				for(int j=0; j<a1[i].length;j++)
				{
					System.out.print(a1[i][j]+a2[j][i]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invalid");
		}
			

	}
}
