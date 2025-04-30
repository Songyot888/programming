import java.util.Scanner;

public class SampleInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับ Input จากผู้ใช้
        System.out.print("Enter your input: ");
        String input = scanner.nextLine();

        // แปลง Input เป็นตัวพิมพ์ใหญ่
        input = input.toUpperCase();

        // แปลง Input เป็น ASCII
        int[] asciiValues = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            asciiValues[i] = (int) input.charAt(i);
        }

        // คำนวณผลลัพธ์
        int sum = 0;
        for (int i = 0; i < asciiValues.length; i++) {
            sum += asciiValues[i];
        }

        // แสดงผลลัพธ์
        System.out.println("Output: " + sum);
    }
}