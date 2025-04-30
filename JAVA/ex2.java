import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int data[][]= new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j]= rn.nextInt(1,11);
                System.out.print(data[i][j]+"\t");
            }System.out.println();
        }
        double avg[][] = new double[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum=0;
            for (int j = 0; j < n; j++) {
                sum+=data[i][j];
            }
            avg[i][i] = (double)sum/n;
            for (int d = 0; d < n; d++) {
                if (i==d) {
                    System.out.printf("%.1f\t",avg[i][d]);
                }
                else{
                    System.out.printf("%.0f\t",avg[i][d]);
                }
            }System.out.println();
        }
    }
}