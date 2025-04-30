import java.util.Scanner;
public class method5 {
    public static void main(String[] args) {
        method5 mt = new method5();

        int n1=mt.input();
        int n2=mt.input();
        mt.ifnum(n1,n2);

    }
    int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int num1 = sc.nextInt();
        return num1;
    }
    int input1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int num2 = sc.nextInt();
        return num2;
    }

    void ifnum(int n1,int n2){
        double sum=(double)n1+n2;
        if(sum>50){
            System.out.println("Hello World");
        }
    }

}
