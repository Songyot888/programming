import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UnicodeConverter {

    public static void main(String[] args) {
        String str = "I CAN SEE YOU";
        ArrayList<String> codepoints = new ArrayList<>();
        
        for (char c : str.toCharArray()) {
            StringBuilder Num = new StringBuilder();
          int a=(int)c;
          Num.append(a);
          //String stra = String.valueOf(Num);
          
                codepoints.add(String.valueOf(Num));
  
        } 
          System.out.println(String.join("+",codepoints));

      }
}