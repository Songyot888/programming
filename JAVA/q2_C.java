import java.util.Scanner;

public class q2_C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    q2_C obj = new q2_C();

    System.out.print("Enter your string: ");
    String input = sc.next();

    String[] slashSplit = obj.split(input,"/");
    for (String text : slashSplit) {
      String[] numberSplit = obj.split(text, ",");
      System.out.println(numberSplit[0] + "\t" + numberSplit[1]);
    }
  }

  String[] split(String string, String value) {
    return string.split(value);
  }
}
