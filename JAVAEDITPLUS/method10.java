import java.util.Scanner;
class method10
{
	public static void main(String[] args) 
	{
		String str = "Hello my name is Supoat Wongsa I was born 1976 I have 36 years old";
		method10 mt= new method10(); 
		mt.numberic(str);
		mt.lowercase(str);
		mt.Uppercase(str);
		mt.Whitespace(str);
		mt.Up_Lo(str);
		mt.lll(str);
		
	}
	void numberic(String str)
	{
		int n=0;
		for (int i=0;i<str.length() ;i++ )
		{
			if (Character.isDigit(str.charAt(i)))
			{
				n++;
			}
		}
		System.out.println(n+" Numberic");
	}
	void lowercase(String str)
	{
		int n=0;
		for (int i=0;i<str.length() ;i++ )
		{
			if (Character.isLowerCase(str.charAt(i)))
			{
				n++;
			}
		}
		System.out.println(n+" Lowercase");
	}
	void Uppercase(String str)
	{
		int n=0;
		for (int i=0;i<str.length() ;i++ )
		{
			if (Character.isUpperCase(str.charAt(i)))
			{
				n++;
			}
		}
		System.out.println(n+" Uppercase");
	}
	void Whitespace(String str)
	{
		int n=1;
		for (int i=0;i<str.length() ;i++ )
		{
			if (Character.isWhitespace(str.charAt(i)))
			{
				n++;
			}
		}
		System.out.println(n+" Word");
	}
	void Up_Lo(String str)
	{
		char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }System.out.println();
		
	}
	void lll(String str) {

        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }

        String changedStr = String.join(" ", words);
		String ch=changedStr.replaceAll(" ","");
        System.out.println(ch);
    }

}
