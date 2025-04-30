import java.util.*;
class test8
{
public static void main(String[] args) 
	{
		test8 mat = new test8();
		int input=mat.input();
		int total=mat.total(input);
		mat.print(total);
	}
	int input()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		for (;true ; )
		{
			System.out.print("Input : ");
			num=sc.nextInt();
			return num;
		}
		
	}
	int total(int score)
	{
		int total=0;
		for (;true ; )
		{
			total+=score;
			if (score<=0)
			{
				break;
			}
			score=input();
		}
		return total;
	}
	void print(int total)
	{
		System.out.print("Total\tDiscout\tNetprice\n");
		System.out.printf("%d\t\n",total);
	}
}
