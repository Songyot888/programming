import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class test1 
{
	public static void main(String[] args) 
	{
		String std="std.xls";
		try
		{
         test1 obj=new test1();
		 FileWriter fwt=new FileWriter(std);
		 String s="Code\tFname\tLname\tMidterm\tFinal\tScore\tGrade";
         fwt.write(s+"\n");
         Scanner sc=new Scanner(System.in);
		 for (;true ; )
		 {
         System.out.print("Code :");
		 String Code=sc.nextLine();
         char ch=Code.charAt(0);
		 if (ch=='0')
		 {
			 break;
		 }
		 else
			{
         System.out.print("Fname :");
		 String Fname=sc.nextLine();
         System.out.print("Lname :");
		 String Lname=sc.nextLine();
        
         int input_Midterm_t=obj.input_Midterm();
         int input_Final_t=obj.input_Final();
         int Score_t=obj.Score(input_Midterm_t,input_Final_t);
		 String Grade_t=obj.Grade(Score_t);
         fwt.write(Code+"\t");
         fwt.write(Fname+"\t");
         fwt.write(Lname+"\t");
         fwt.write(input_Midterm_t+"\t");
         fwt.write(input_Final_t+"\t");
         fwt.write(Score_t+"\t");
         fwt.write(Grade_t+"\n");
         }
		 
		}
		fwt.close();
		}
		catch (IOException ex)
		{
			System.out.println("ERROR");
		}
		
	}
	    int input_Midterm(){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Midterm :");
		 int Midterm=sc.nextInt();
        return Midterm;
		}
		int input_Final(){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Final :");
		 int Final=sc.nextInt();
		 return Final;
		}
        int Score( int input_Midterm_t, int input_Final_t){
			int sco=0;
			sco=input_Midterm_t+input_Final_t;
			return sco;
        } 
		String Grade( int Score_t){
			String grade="";
			if (Score_t>=80)
			{ 
                grade="A";
			}
			else if (Score_t>=70)
			{ 
                grade="B";
			}
			else if (Score_t>=60)
			{ 
                grade="C";
			}
			else if (Score_t>=50)
			{ 
                grade="D";
			}
			else{
				grade="F";
			}
			return grade;
		}
}