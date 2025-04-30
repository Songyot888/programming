import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NullPointerException;
class week15_test2 
{
	public static void main(String[] args) 
	{
		String fileName="xxx.txt";
		String x;
		char ch;
		try
		{
			BufferedReader bf = new BufferedReader(new FileReader(fileName));
				for (; ; )
				{
					x=bf.readLine();
					System.out.println(x);
						if (x==null)
						{
							break;
						}
				}
				
		}
		catch (FileNotFoundException ccc)
		{
		}
		catch (IOException xxx)
		{
		}
		
	}
}
