import java.util.Scanner;
public class test_1 {

	public static void main(String[] args) {
		String answer, ans="yes";
		int j,i,s,n;
		float Q,k,m;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to login system Yes:");
			answer = sc.next();
			if(answer.equals(ans)) {
				System.out.print("Input j:");
				j = sc.nextInt();
				switch(j) {
				case 1:{
					System.out.println("Input i:");
					i = sc.nextInt();
					if(i>20) {
						System.out.println("Input s:");
						s =sc.nextInt();
						Q = s/i;
						System.out.println("Q ="+Q);
						System.out.println("s ="+s);
						System.out.println("i ="+i);
					}
					break;
				}
				case 2:{
					i = 0;
					n = 0;
					while(i<6) {
						while(n<6) {
							k = (n*i)/(n+1);
							n = n+1;
							m = k;
							System.out.println("k = "+k);
							System.out.println("m = "+m);
							System.out.println("n = "+n);
						}
						i++;
					}
					break;
				}
				default:{
					System.out.print("Please input num");
				}
			}
		}
	}
}