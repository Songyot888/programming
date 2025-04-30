import java.util.*;
class ex3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.print("Size Name : ");
		n=sc.nextInt();
		int i = 0;
		String x[]=new String[n];
		
		int mid[]=new int[n];
		int Final[]=new int[n];
		int sum[]=new int[n];
		String na[]=new String[n];
		while (i<n)
		{
			System.out.print("Name : ");
			x[i]=kb.nextLine();
			System.out.print("midterm : ");
			mid[i]=sc.nextInt();
			System.out.print("final : ");
			Final[i]=sc.nextInt();
			sum[i]=mid[i]+Final[i];
			if (sum[i]>=70)
			{
				na[i]= "S";
			}else if (sum[i]<70)
			{
				na[i]= "U";
			}
			i++;
		}

		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Name\tMidterm\t Final\tScore\tGrade");
		int max=0,max1=0,max2=0;
		int min=0,min1=0,min2=0;
		
		max = Arrays.stream(mid).max().getAsInt();
		max1 = Arrays.stream(Final).max().getAsInt();
		max2 = Arrays.stream(sum).max().getAsInt();
		min = Arrays.stream(mid).min().getAsInt();
		min1 = Arrays.stream(Final).min().getAsInt();
		min2 = Arrays.stream(sum).min().getAsInt();
		
		String minmid = x[0],minFin = x[0],minsum = x[0];
		String maxmid = x[0],maxFin = x[0],maxsum = x[0];
		for (int j=0;j<n ;j++ )
		{
			System.out.print(x[j]+"\t");
			System.out.print(mid[j]);
			System.out.print("\t "+Final[j]);
			System.out.print("\t"+sum[j]);
			System.out.println("\t"+na[j]);
			if (mid[j]<= min)
			{
				minmid = x[j];
			}
			if (mid[j]>= max)
			{
				maxmid = x[j];
			}
			if (Final[j]<= min1)
			{
				minFin = x[j];
			}
			if (Final[j]>= max1)
			{
				maxFin = x[j];
			}
			if (sum[j]<= min2)
			{
				minsum = x[j];
			}
			if (sum[j]>= max2)
			{
				maxsum = x[j];
			}
		}
		System.out.println("MaxMid MaxFinal MaxScore");
		System.out.println(max+"\t"+max1+"\t"+max2);
		System.out.println("MinMid MinFinal MinScore");
		System.out.println(min+"\t"+min1+"\t"+min2);
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Name Min Midterm "+minmid+"\nName Max Midterm "+maxmid);
		System.out.println("Name Min Final\t "+minFin+"\nName Max Final\t "+maxFin);
		System.out.println("Name Min Score\t "+minsum+"\nName Max Score\t "+maxsum);
	}
}