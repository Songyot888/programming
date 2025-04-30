import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.NumberFormatException;
class week15_66011212090 
{
	public static void main(String[] args) 
	{
		week15_66011212090 mt=new week15_66011212090 ();
		String fileName="pop.xls";
		FileWriter fi=new FileWriter(fileName);

		String Grade="";
		int sum=mt.sum(fi,fileName);
		//String grade1=mt.grade();
		
	}
	
	String putName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input(,) CODE|Fname|Lname:");
		String code=sc.next();	
		
		return code;
	}
	
	String putNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input(,) MIDTERM|FINAL:");
		String score=sc.next();
		return score;
	}
	
	int sum(FileWriter fi,String fileName)
	{
		String score1="";
		String code1="";
		int sum=0;
		for (;true; )
			{
				String x="CODE\tFname\tLname\tMIDTERM\tFINAL\tSUM\tGrade\n";
				fi.write(x);
				code1=putName();
				String	str=code1.replaceAll(",","\t");
				if (code1.startsWith("0")) {
				  break;
				}
				score1=putNum();
				String[] parts = score1.split(",");
				int mid=Integer.parseInt(parts[0]);
				int fin=Integer.parseInt(parts[1]);
				sum=mid+fin;
			}
			return sum;
	}
	
	/*String grade()
	{
				if (sum>=80)
				{
					Grade="A";
				}
				else if (sum>=70)
				{
					Grade="B";
				}
				else if (sum>=60)
				{
					Grade="C";
				}
				else if (sum>=50)
				{
					Grade="D";
				}
				else 
				{
					Grade="F";
				}
	}*/
	
	/*void out()
	{
			
		try
		{
			
			
			
			
			int sum=0;
			fi.write(str+"\t");
			fi.write(mid+"\t");
			fi.write(fin+"\t");
			fi.write(sum+"\t");
			fi.write(Grade+"\n");
			fi.close();
		catch (IOException cxxx)
		{
			System.out.println("ERROR!!!");
		}
		catch (NumberFormatException cxxx)
		{
			System.out.println("ERROR!!!");
		}
	}*/
}
