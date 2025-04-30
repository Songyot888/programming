import java.util.Scanner;
class ex2 
{
	public static void main(String[] args) 
	{
		Scanner num=new Scanner(System.in);
		int n;
		System.out.print("Enter N:");
		n=num.nextInt();
		
		double avg[][]=new double [n][n];
		int sum[][]=new int[n][n];
		int x[][]=new int[n][n];

		System.out.println("DATA");
		
		for(int row=0;row<x.length;row++)
		{
			for(int colum=0;colum<x[row].length;colum++)
			{
				x[row][colum]=(int)(Math.random()*10)+1;
				System.out.print(x[row][colum]+"\t");
				sum[row][colum]+=x[row][colum];
			}
			System.out.println();
		}

		System.out.println("DATAAVERAGE");
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				avg[i][j]=(double)sum[i][j]/n;
				if(i==j)
				{
					System.out.printf("%.2f\t",avg[i][j]);
				}
				else
				{
					sum[i][j]=0;
					System.out.print(sum[i][j]+"\t");
				}
				
			}
			System.out.println();
		}
	}
}