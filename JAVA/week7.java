//Songyot Wonghathaen 66011212090
import java.util.Scanner;
class week7_66011212090 
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
			System.out.println("-----------------------------------");
			sum[i]=mid[i]+Final[i];
			if (sum[i]>=70) { na[i]= "S"; }
			else if (sum[i]<70) {na[i]= "U"; }
			i++;
		}

		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("Name\tMidterm\t Final\tScore\tGrade");
		int min=mid[0],min1=Final[0],min2=sum[0];
		int max=mid[0],max1=Final[0],max2=sum[0];
		
		String minmid = x[0],minFin = x[0],minsum = x[0];
		String maxmid = x[0],maxFin = x[0],maxsum = x[0];
			
		for (int t=0;t<n ;t++ )
		{
			if (mid[t]<min) 
				{ min=mid[t] ; minmid = x[t]; }
			if (mid[t]>max) 
				{ max=mid[t] ; maxmid = x[t]; }
			if (Final[t]<min1) 
				{ min1=Final[t] ; minFin = x[t]; }
			if (Final[t]>max1) 
				{ max1=Final[t] ; maxFin = x[t]; }
			if (sum[t]<min2) 
				{ min2=sum[t] ; minsum = x[t]; }
			if (sum[t]>max2) 
				{ max2=sum[t] ; maxsum = x[t];  }
			System.out.print(x[t]+"\t");
			System.out.print(mid[t]);
			System.out.print("\t "+Final[t]);
			System.out.print("\t"+sum[t]);
			System.out.println("\t"+na[t]);
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