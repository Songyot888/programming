import java.util.*;
class  method5
{
	public static void main(String[] args) 
	{
		method5 mt = new method5();
		int money = mt.money();
		int year = mt.year();
		double cal = mt.cal(year,money);
		mt.prin(year,money,cal);
	}
	int money()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Money : ");
		int money = sc.nextInt();
		return money;
	}
	int year()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Year : ");
		int year = sc.nextInt();
		return year;
	}
	double cal(int year,int money)
	{
		return money * Math.pow((1 + 0.0237), year);

	}
	void prin(int y,int m,double cal)
	{
		System.out.printf("(pLone%d,%d,2.37)=%f",m,y,cal);
	}
	
}
