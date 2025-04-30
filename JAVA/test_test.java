import java.util.Scanner;

public class test_test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับรหัสบัตรประชาชน
        System.out.print("ป้อนรหัสบัตรประชาชน 13 หลัก: ");
        String idNumber = scanner.nextLine();

        // แยกหลักของรหัสประชาชน
        int[] digits = new int[13];
        for (int i = 0; i < idNumber.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(idNumber.charAt(i)));
        }

        // เรียกใช้ method คำนวณเลขประจำตัว
        int checkDigit = calculateCheckDigit(digits);

        // แสดงผลลัพธ์
        System.out.println("เลขประจำตัว: " + checkDigit);
    }

    private static int calculateCheckDigit(int[] digits) {
        int[] weights = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int sum = 0;

        // คูณแต่ละหลักกับเลขประจำหลัก
        for (int i = 0; i < digits.length - 1; i++) {
            sum += digits[i] * weights[i];
        }

        // หาเศษ modulo 11
        int remainder = sum % 11;

        // ตรวจสอบค่า modulo
        if (remainder == 0) {
            return 1;
        } else if (remainder == 1) {
            return 0;
        } else {
            return 11 - remainder;
        }
    }
}
