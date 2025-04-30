import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input NUM : ");
        int n = sc.nextInt();
        int data[][]=new int [n][n];
        int sum[]=new int [n];
        double datavga[][]=new double[n][n];
        System.out.println("DATA");
        for(int i=0; i<data.length ; i++){
            for(int j=0; j<data[i].length ; j++){
                data[i][j]=(int)(Math.random()*11+1);
                System.out.print(data[i][j]+"\t");
                sum[i]+=data[i][j];
            }System.out.println();
        }
        System.out.println("DATAAVERAGE ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i==j) {
                    datavga[i][j]=(double)sum[i]/n;
                    System.out.printf("%.1f\t",datavga[i][j]);
                }else{
                    System.out.print(datavga[i][j]+"\t");
                }
            }System.out.println();
        }
    }
}