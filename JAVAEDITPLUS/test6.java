import java.util.*;
class test6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		double money_m[] = new double [n];
		String Name_p1[] = new String [n];
		double avg = 0;
		
		
		for (int i=0;i<n ;i++ )
		{
			Name_p1[i] = sc.next();
			money_m[i] = sc.nextInt();
		}
		System.out.println("NAME\tMONEY");
		for (int i=0;i<n ;i++ )
		{
			avg = money_m[i]/n;
			System.out.printf("%s\t%.1f\n",Name_p1[i],money_m[i]);
		}
		System.out.printf("AVERAGE = %.1f\n",avg);
	}
}
