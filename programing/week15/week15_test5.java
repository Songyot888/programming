import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
class week15_test5
{
	public static void main(String[] args) 
	{
		String fileName="far.docx";
		try
		{
			Scanner fin = new Scanner(System.in);
			FileOutputStream wft=new FileOutputStream(fileName,true);
			for (; ; )
			{
				
				int x=System.in.read();
				wft.write(x);
				if (x==65)
				{
					break;
				}
			}
			
		}
		catch (FileNotFoundException xxx)
		{
		}
		catch (IOException xxx)
		{
		}
		
		
	}
}
