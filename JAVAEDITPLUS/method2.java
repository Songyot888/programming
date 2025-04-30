import java.util.*;
class method2 
{
	public static void main(String[] args) 
	{
		method2 mt = new method2();
		
		int loop=mt.input();
		int loop1=mt.total(loop);
		float loop2=mt.discount(loop1);
		float loop3=mt.Netprice(loop1,loop2);
		mt.prin(loop1,loop2,loop3);
	}
	public static int input(){
		int num1=0;
		Scanner sc = new Scanner(System.in);
		for (;true ; )
		{
			System.out.print("Input : ");
			num1 = sc.nextInt();
			return num1;
		}
	}
	public static int total(int num1){
		int total=0;
			do
			{
				total+=num1;
				num1=input();
			}
			while (num1>0);
			return total;
	}
	float discount(int lop)
	{
		float discout;
			discout=(float)(lop*3)/100;
		return discout;
	}
	float Netprice(int total,float discout)
	{
		float net_price;
		net_price=total-discout;
		return net_price;
	}
	void prin(int total,float discout,float net_price){
		System.out.print("Total\tDiscout\tNetprice\n");
		System.out.printf("%d\t%.1f\t%.1f\n",total,discout,net_price);
	}
}
