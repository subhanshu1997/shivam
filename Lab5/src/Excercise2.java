import java.util.Scanner;

public class Excercise2 {
	public int nonrecursive(int n){
		int a=1,b=1,c;
		n=n-2;
		while(n!=0) {
			c=b;
			b=b+a;
			a=c;
			n--;
		}
		return b;
	}
	public int recursive(int n){
		int n1=1,n2=1,n3=0;
	    if(n>=0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;     
	         recursive(n-1);    
	     }
	    return n;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		Excercise2 ex=new Excercise2();
		System.out.println("Calling nonrecursive function");
		System.out.println(ex.nonrecursive(n));
		System.out.println("Calling nonrecursive function");
		System.out.println(ex.recursive(n));

	}

}
