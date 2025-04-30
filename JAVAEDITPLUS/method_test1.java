import java.util.Scanner;
class method_test1 
{
	public static void main(String[] args) 
	{
		method_test1 mt = new method_test1();
		int pice=mt.input();
		int sum=mt.sum_pice(pice);
	}
	int input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input pice: ");
		int pice = sc.nextInt();
		return pice;
	}
	int sum_pice(int pice)
	{
		int sum = 0;
		for (; ; )
		{
			sum+=pice;
			if (pice<=0)
			{
				break;
			}
			pice=input();
			//pices=pice();
		}
		
		return sum;
	}
}
