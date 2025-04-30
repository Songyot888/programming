public class StringToIntExample {

    public static void main(String[] args) {
        String str = "20,12"; // สตริงตัวอย่าง

        // แยกสตริงเป็น array
        String[] parts = str.split(",");

        // แปลงสตริงเป็น int เก็บในตัวแปร
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);

        // แสดงผลลัพธ์
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}