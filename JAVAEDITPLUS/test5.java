import java.util.Scanner;
class test5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String []str=new String[n];
		double []weight=new double[n];
		String s[]=new String[n];
		
		for (int i=0;i<n ;i++ )
		{
			System.out.print("LcnNum/Weight : ");
			str[i]=sc.next();
			weight[i]=sc.nextDouble();
		}
		System.out.println("LcnNum\tWeight\tCAS\tcout\tPASSpay");
		for (int i=0;i<n ;i++ )
		{
			if (weight[i]<=5&&weight[i]>3.22)
			{
				s[i]="TRUCK";
			}else if (weight[i]<=3.26&&weight[i]>=2.75)
			{
				s[i]="VAN";
			}else if (weight[i]<=1.75&&weight[i]>=0.75)
			{
				s[i]="PASS";
			}
			else
			{
				s[i]="ERROR";
			}
			System.out.printf("%s\t%.1f\t%s\t\n",str[i],weight[i],s[i]);
		}
		
	}
}
