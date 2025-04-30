import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // รับข้อมูล String จากผู้ใช้
        System.out.print("ป้อนข้อมูล: ");
        String input = scanner.nextLine();
        // แยกส่วนประกอบของ String
        String[] parts = input.split("[\\%\\-\\/\\*\\+]");
        // ตรวจสอบจำนวนส่วนประกอบ
        if (parts.length != 2) {
            System.out.println("รูปแบบข้อมูลไม่ถูกต้อง");
            return;
        }
        // แปลง String เป็นตัวเลข
        double num1 = Double.parseDouble(parts[0]);
        double num2 = Double.parseDouble(parts[1]);

        // คำนวณผลลัพธ์
        double result;
        switch (input.charAt(1)) {
            case '*':
                result = num1 * num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("ตัวดำเนินการไม่ถูกต้อง");
                return;
        }
        // แสดงผลลัพธ์
        System.out.printf("ผลลัพธ์:%.3f " , result);
    }
}
