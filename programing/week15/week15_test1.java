import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class week15_test1 
{
	public static void main(String[] args) 
	{
		String fileName="week15_test1.class";
		try
		{
			FileInputStream fin=new FileInputStream(fileName);
			//System.out.println(fileName);
			int x;
			char ch;
			for (; ; )
			{
				x=fin.read();
				ch=(char)x;
				if (x==-1)
				{
					break;
				}
				System.out.print(ch);
			}
			
			
			
		}
		catch (FileNotFoundException xxx)
		{
			System.out.println("NO File "+fileName);
		}
		catch (IOException xxxx)
		{
			System.out.println("NO File "+fileName);
		}
		
	
	}
}