import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
class week15_test3
{
	public static void main(String[] args) 
	{
		String fileName="xxx.txt";
		
		try
		{
			Scanner fin = new Scanner(new File(fileName));
			for (;fin.hasNext() ; )
			{
				String	next=fin.next();
				System.out.println(next);
			}
		}
		catch (FileNotFoundException xxx)
		{
		}
		
	}
}
