import java.util.Scanner;

public class Flowchart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // เริ่มต้น

        int num1=0, num2=0, num, sum = 0;

        // คำถาม 1

        System.out.print("ป้อนตัวเลข: ");
        num = scanner.nextInt();

        System.out.print("เลือกตัวเลือก (a หรือ b): ");
        String choice = scanner.next();

        // กรณี a

        if (choice.equals("a")) {
            if ((num > 10) && (num <= 50)) {
                for (int i = 0; i < 3; i++) {
                    System.out.print("i = " + i + " ");

                    for (int j = 0; j < 5; j++) {
                        System.out.print("j = " + j + " ");

                        if ((num1 == 0) && (num2 == 0)) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }

                        num1 = num % 2;
                        num2 = num % 5;

                        System.out.println("num1 = " + num1 + ", num2 = " + num2);

                        j++;
                    }

                    
                }
            } else {
                System.out.println("false");
            }
        }

        // กรณี b

        else if (choice.equals("b")) {
            if ((num1 == 0) || (num2 == 0)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        // จบโปรแกรม

        System.out.println("END");
    }
}