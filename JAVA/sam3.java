import java.util.Scanner;
import java.util.HashMap;
class sam3 
{
	public static void main(String[] args) 
	{
		HashMap <Integer,Integer>hm=new HashMap<Integer,Integer>();
		sam3 obj=new sam3();
		String input_re=obj.input();
		String []parts_re=obj.plite (input_re);
		obj.hash(hm,parts_re);
		obj.print(hm);
	}
	String input()
	{
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		return input;
	}
	String []plite(String input_re)
	{
		String[]parts=input_re.split("/");
		return parts;                                                         
	}
	void hash(HashMap<Integer,Integer> hm,String []parts_re)
	{
		for (String part : parts_re )
		{
			String []keyvalue=part.split(",");
			int key=Integer.parseInt(keyvalue[0]);
			int value=Integer.parseInt(keyvalue[1]);
			hm.put(key,value);
		}
	}
	void print(HashMap <Integer,Integer>hm)
	{
		for (int key : hm.keySet()) {
            // พิมพ์ key และ value ออกมา
            System.out.println(key + "   " + hm.get(key));
        }
	}
}