import java.util.Scanner;
import java.util.ArrayList;

public class Q2_D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter you string: ");
    String input = sc.nextLine();

    String[] splitWord = input.split(" ");

    ArrayList<String> charNumbers = new ArrayList<String>();

    for (String string : splitWord) {
      StringBuilder convertToNum = new StringBuilder();
      for (int k = 0; k < string.length(); k++) {
        char iChar = string.charAt(k);
        int charNum = Character.getNumericValue(iChar);
        convertToNum.append(charNum + 55);
      }

      charNumbers.add(String.valueOf(convertToNum));
    }

    System.out.println(String.join("+", charNumbers));
  }
}