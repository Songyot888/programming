import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char grade = ' ';
    //System.out.println("Input score: ");
    int score = sc.nextInt();
    
    if (score > 0 && score <=100) {
        switch (score) {
            case 1:
            case 2:
            case 3:
            case 4: grade = 'F'; break;
            case 5: grade = 'D'; break;
            case 6: grade = 'C'; break;
            case 7: grade = 'B'; break;
            case 8:
            case 9:
            case 10: grade = 'A';
        }
        System.out.println("Grade: " + grade);
    } else
        System.out.println("Score over flow");
}
}