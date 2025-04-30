import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
class exD
{
	public static void main(String[] args) 
	{
		HashMap <String,Integer>mp = new HashMap<String,Integer>();
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		exD mt = new exD();
		String num1 = mt.intput1(sc);
		String c = mt.intput2(sc);
		String num2 = mt.intput3(sc);
		String digit = mt.digit(numbers,num1);
	}
	void number(HashMap <String,Integer>mp)
	{
		//นำข้อมูลไปเก็บใน HashMap
		mp.put("ZERO", 0);
		mp.put("ONE", 1);
        mp.put("TWO", 2);
        mp.put("THREE", 3);
        mp.put("FOUR", 4);
        mp.put("FIVE", 5);
        mp.put("SIX", 6);
        mp.put("SEVEN", 7);
        mp.put("EIGHT", 8);
        mp.put("NINE", 9);
		System.out.println(mp);
	}
	String input1(Scanner sc)
	{
		String num1 = sc.nextLine();
		
		return num1;
	}
	String input2(Scanner sc)
	{
		String c = c.nextLine();
		return c;
	}
	String input2(Scanner sc)
	{
		String num2 = num.nextLine();
		return num2;
	}
	
	void digit(ArrayList<Integer> numbers,String xxx)
	{
		String[] tokens = num.split(" ");
        for (String token : tokens) {
            numbers.add(DIGIT_MAP.get(token.toUpperCase()));
        }
	}
}
