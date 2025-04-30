import java.util.Scanner;
class method6
{
	public static void main(String[] args) 
	{
		method6 mt = new method6();
		int x=mt.num();
		int n=mt.lop();
		int cal=mt.calurus(x,n);
		mt.prin(x,n,cal);
	}
	int num()
	{
		Scanner sc = new Scanner (System.in);
		System.out.printf("X:");
		int x = sc.nextInt();
		return x;
	}
	int lop()
	{
		Scanner sc = new Scanner (System.in);
		System.out.printf("n:");
		int n = sc.nextInt();
		return n;
	}
	int calurus(int x,int n)
	{
		int cal=1;
		for (int i=1;i<=n ;i++ )
		{
			cal*=x;
		}
		return cal;
	}
	void prin(int x,int n,int cal)
	{
		System.out.printf("%d^%d=%d",x,n,cal);
	}
}
