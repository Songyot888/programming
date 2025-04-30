import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
class week15_test6 
{
	public static void main(String[] args) 
	{
		String fileName="pop.docx";
		try
		{
			String x="";
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			Scanner sc=new Scanner(System.in);
			for (; ; )
			{
				x=sc.nextLine();
				out.write(x);
				if (x.equals("/"))
				{
					break;
				}
			}
			out.close();
			
		}
		catch (IOException xxx)
		{
			System.out.println("ERROR!!!!");
		}
		
	}
}
