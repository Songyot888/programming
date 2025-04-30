import java.util.ArrayList;
import java.util.Scanner;
class  q2_test1
{
	public static void main(String[] args) 
	{
		q2_test1 mt = new q2_test1();
		String Ms=mt.put();
		mt.number(Ms);
	}
	String put()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("InputMs:");
		String Ms=sc.nextLine();
		return Ms;
	}
	void number(String Ms)
	{
		int total,sum=0;
		q2_test1 mt = new q2_test1();
		for (int i=0;i<Ms.length() ;i++ )
		{
			if (Character.isDigit(Ms.charAt(i)))
			{
				total=Character.getNumericValue(Ms.charAt(i));
				sum+=total;
			}
		}
		System.out.println(sum);
		
	}
}
