import java.util.*;
class method3 
{
	public static void main(String[] args) 
	{
		
		method3 mt = new method3();
		int loop=mt.inNum();
		int loop_mid[]=mt.mid(loop);
		int loop_fin[]=mt.fin(loop);
		int loop_sum[]=mt.sum(loop,loop_mid,loop_fin);
		char loop_grade[]=mt.grade(loop,loop_sum);
		mt.prin(loop_mid,loop_fin,loop_grade);
		
	}
	
	public static int inNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input N : ");
		int N = sc.nextInt();
		return N;
	}
	
	public static int[] mid(int n){
		Scanner sc = new Scanner(System.in);
		int mid[] = new int [n];
		for (int i=0;i < mid.length ;i++ )
		{
			System.out.print("Input Mid : ");
			mid[i]=sc.nextInt();
		}
		return mid ;
	}
	
	public static int[] fin(int n){
		Scanner sc = new Scanner(System.in);
		int fin[] = new int [n];
		for (int i=0;i < fin.length ;i++ )
		{
			System.out.print("Input Fin : ");
			fin[i]=sc.nextInt();
		}
		return fin ;
	}
	public static char[] grade(int n,int[] sum){
		char grade[]=new char[n];
		for (int i=0;i < sum.length ;i++ )
		{
			if (sum[i]>=80)
			{
				grade[i]='A';
			}else if (sum[i]>=70)
			{
				grade[i]='B';
			}else if (sum[i]>=60)
			{ 
				grade[i]='C';
			}else if (sum[i]>=50)
			{
				grade[i]='D';
			}else{
				grade[i]='f';
			}
		}
		return grade;
	}
	
	public static int[] sum(int n,int[] mid,int[] fin){
		int sum[]=new int [n];
		for (int i=0;i < sum.length ;i++ )
		{
			sum[i]=mid[i]+fin[i];
		}
		return sum ;
	}
	
	
	void prin(int[] mid,int[] fin,char[] grade){
		for (int i=0;i < mid.length ;i++ )
		{
			System.out.print(mid[i]+"\t");
		}System.out.println();
		
		for (int i=0;i < fin.length ;i++ )
		{
			System.out.print(fin[i]+"\t");
		}System.out.println();
		for (int i=0;i < fin.length ;i++ )
		{
			System.out.print(grade[i]+"\t");
		}System.out.println();
		
	}
}
