import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // เก็บข้อมูลนักเรียน
        String[] names = {"Manee Rakchart", "Mana Bakchart", "Veera Dekdee", "Choojai Wongsa", "Pithi Romyen"};
        int[] midterms = {25, 16, 27, 37, 41};
        int[] finals = {36, 49, 30, 22, 23};
        int[] totals = new int[5];

        // คำนวณคะแนนรวม
        for (int i = 0; i < totals.length; i++) {
            totals[i] = midterms[i] + finals[i];
        }

        // หาคะแนนต่ำสุดและสูงสุด
        int minTotal = Integer.MAX_VALUE;
        int maxTotal = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < totals.length; i++) {
            if (totals[i] < minTotal) {
                minTotal = totals[i];
                minIndex = i;
            }

            if (totals[i] > maxTotal) {
                maxTotal = totals[i];
                maxIndex = i;
            }
        }

        // แสดงผล
        System.out.println("======================================");
        System.out.println("         ผลการสอบปลายภาค         ");
        System.out.println("======================================");
        System.out.println("| ชื่อ-นามสกุล | คะแนนกลางภาค | คะแนนปลายภาค | คะแนนรวม |");
        System.out.println("-------------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("| %-15s | %10d | %10d | %10d |\n", names[i], midterms[i], finals[i], totals[i]);
        }
        System.out.println("-------------------------------------");
        System.out.println("ผู้ที่ได้คะแนนต่ำสุด:");
        System.out.println("ชื่อ-นามสกุล: " + names[minIndex]);
        System.out.println("คะแนนรวม: " + minTotal);

        System.out.println("\nผู้ที่ได้คะแนนสูงสุด:");
        System.out.println("ชื่อ-นามสกุล: " + names[maxIndex]);
        System.out.println("คะแนนรวม: " + maxTotal);
    }
}
