import java.util.Scanner;
class  week12_66011212090
{
	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.println("input number");
        String num=n.nextLine();
		week12_66011212090 x=new week12_66011212090();
		String number=x.numtoarray(num);
	
		char numberarray[]=x.stringToCharArray(number);
		int numresult[]=x.numint(numberarray);
		int numresult12[]=x.numint12(numresult);
		int result[]=x.resultnumber(numresult,numresult12);
		int allsum=x.sumall(result);
		int nummod=x.mod(allsum);
		int sumnew=x.sumnew(nummod);
		x.allnumber(num,sumnew);
		
	}
	 String numtoarray(String num)
	{
	  String re = num.replaceAll("-", "");
      String re2 = re.replaceAll(" ", "");
        return re2;
	}
	char[] stringToCharArray(String number) {
    char arraynum[] = new char[number.length()];
    for (int i = 0; i < number.length(); i++) {
        arraynum[i] = number.charAt(i);
        if (!Character.isDigit(arraynum[i])) {
            System.out.println("False");
			
            return new char[0];
        }
        System.out.print(arraynum[i]);
    }
    System.out.println();
    return arraynum;
}
	int[] numint(char[] array)
	{
		int[] numint= new int[array.length];
        for(int i=0;i<array.length-1;i++)
		{  
         int number = Character.getNumericValue(array[i]);
		  numint[i] = number;
           System.out.print(numint[i]+"\t");
		}
			System.out.println();
       return numint;
	}
	int[] numint12(int[] arrayint) {
    int[] num12 = new int[13];
   for (int i = 13; i >= 2; i--) { 
        num12[13 - i] = i;
        System.out.print(num12[13 - i] + "\t");
    }
    System.out.println();
    return num12;
	}
	int[] resultnumber(int[] array1,int[] array2)
	{
		int[] sum = new int[array1.length];
       for(int i=0;i<array1.length-1;i++)
		{
         sum[i]=array1[i]*array2[i];
		  System.out.print(sum[i]+"\t");

		}
		System.out.println();
        return sum;
	}
	int sumall(int[] sumarray)
	{
		int sum=0;
       for(int i=0;i<sumarray.length;i++)
		{
         sum=sum+sumarray[i];
		}
		 System.out.println("sum ="+sum);
		return sum;
	}
	int mod(int sumnum)
	{
       int nummod;
        nummod=sumnum%11;
		System.out.println("nummod ="+nummod);
      return nummod;
	}
	int sumnew(int summod)
	{
       int newsum;
	   newsum=11-summod;
	   System.out.println("11-"+summod+"="+newsum);
	   return newsum;

	}
	void allnumber(String num1,int x)
	{
		if(x<10)
		{
      String sub=num1.substring(0,num1.length()-1);
      System.out.println(sub+"["+x+"]");
		}
		else
		{
         x=x-10;
          String sub=num1.substring(0,num1.length()-1);
          System.out.println(sub+"["+x+"]");
		}
	}
	
	
	
}