import java.util.Scanner;

public class Excercise3 {
	public static boolean isPrime(int n) {
		for(int i=n-1;i>1;i--) {
			if(n%i==0) {
				return false; 
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
