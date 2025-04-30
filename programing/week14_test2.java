import java.util.HashSet;
import java.util.Iterator;
class week14_test2 
{
	public static void main(String[] args) 
	{
		HashSet <String>has=new HashSet<String>();
		has.add("Jo");	has.add("Max");
		has.add("Zer"); has.add("Bob");
		
		/*System.out.println(has);
		int x=has.size();
		System.out.println(x);*/
		
		System.out.println(has);
		Iterator <String>x=has.iterator();
		
		String str=x.next();
		System.out.print(str+"\t");
		/*for (int i=0;i<has.size();i++ )
		{
			String str=x.next();
			System.out.print(str+"\t");
		}System.out.println();*/
		
		
	}
}
