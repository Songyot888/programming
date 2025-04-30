import java.util.Scanner;
import java.util.ArrayList;
class q2_D {
	public static void main(String[] args) 	
	{
		ArrayList<String> ay=new ArrayList<String>();
		q2_D mt = new q2_D();
		String input=mt.put();
		mt.lop(ay,input);
	}
	String put()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String input = sc.nextLine();
		return input;
	}
	void lop(ArrayList<String> ay,String str)
	{
		String []word=str.split(" ");
		for (String s : word)
		{
			StringBuilder Num = new StringBuilder();
			for (int i=0;i<s.length() ;i++ )
			{
				char c = s.charAt(i);
				int num =(int)c;
				Num.append(num);
			}
				ay.add(String.valueOf(Num));
		} 
		System.out.println(String.join("+", ay));
	}
}

