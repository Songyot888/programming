import java.io.IOException;
class week15_test 
{
	public static void main(String[] args) 
	{
		String sum="";
		try
		{
			for (; ; )
			{
				int x=System.in.read();
				char ch=(char)x;
				sum+=ch;
				if (x==-1)
				{
					break;
				}
			}
			System.out.print(sum);
			
		}
		catch (IOException xxx)
		{
			System.out.print("I/OERROR");
		}
		
	}
}
