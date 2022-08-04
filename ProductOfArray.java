import java.util.Scanner;

public class ProductOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter MatArow value");
		int MatArow=sc.nextInt();
		System.out.println("enter MatAcol value");
		int MatAcol=sc.nextInt();
		System.out.println("enter MatBrow value");
		int MatBrow=sc.nextInt();
		System.out.println("enter MatBcol value");
		int MatBcol=sc.nextInt();
		
		int MatA[][]=new int[MatArow][MatAcol];  
		int MatB[][]=new int[MatBrow][MatBcol];
		
		if(MatArow==MatBcol && MatAcol==MatBrow)
		{
			// to scan elements for MatA
			for(int b=0; b<MatA.length;b++)
			{
				for(int c=0; c<MatA[b].length;c++)
				{
					System.out.print("enter the value for MatA "+b+
							" row and "+c+" column : ");
					MatA[b][c]=sc.nextInt();
				}
			}
			
			//to scan elements for MatB
			for(int b=0; b<MatB.length;b++)
			{
				for(int c=0; c<MatB[b].length;c++)
				{
					System.out.print("enter the value for MatB "+b+
							" row and "+c+" column : ");
					MatB[b][c]=sc.nextInt();
				}
			}
			
			//to perform addition
			for(int i=0; i<MatA.length;i++)
			{ 
				for(int k=0;k<MatA[i].length;k++)
				{
					int sum=0;
					for(int j=0;j<MatA[i].length;j++)
					{
						sum=sum+(MatA[i][j]*MatB[j][k]);
	//					System.out.print(MatA[i][j]+MatB[i][j]+" ");
					}
					System.out.print(sum+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invalid! cannot perform addition");
		}
		
		

	}
}
