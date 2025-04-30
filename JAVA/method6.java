import java.util.Scanner;

public class method6 {
    public static void main(String[] args) {
        method6 mt = new method6();
            int sum = mt.input1()+mt.input2();
            mt.print(sum);
    }
    int  input1 (){
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        return num1;
    }
    int  input2 (){
        Scanner sc = new Scanner (System.in);
        int num2 = sc.nextInt();
        return num2;
    }
    void print(int sum){
        if (sum>5) {
            System.out.println("66011212090");    
        }
        else{
            System.out.println("Error Input sum");
        }
        
    }
}
