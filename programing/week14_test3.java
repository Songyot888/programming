import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
class  week14_test3
{
	public static void main(String[] args) 
	{
		HashMap <String,Integer>mp = new HashMap<String,Integer>();
		//นำข้อมูลไปเก็บใน HashMap
		mp.put("Jo",80);
		mp.put("Max",75);
		mp.put("Zer",61);
		mp.put("Bob",13);
		System.out.println(mp);
		
		//ดึงค่าIntegerออกมาโดยการใส่key
		/*int x=mp.get("Max");
		System.out.println(x);*/
		
		//setคือการดึงkeyที่ป้อมเข้ามาทั้งหมด และดึก.nextคือการดึงkeyมาทีละตัว
		Set <String>st=mp.keySet();
		System.out.println(st);
		Iterator <String>itt=st.iterator();
		String x="";
		Integer d;
		for (int i=0;i<mp.size() ;i++ )
		{
			x=itt.next();
			d=mp.get(x);
			System.out.println(x+"="+d);
		}
		
	}
}
