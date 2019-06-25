import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age");
		try{int age=s.nextInt();
		if(age<=15) {
			throw new AgeInvalidException();
		}
		else {
			System.out.println("Age is Valid");
		}
		}catch(AgeInvalidException e) {
			System.out.println("Please Enter Valid Age");
		}

	}
}
	class AgeInvalidException extends Exception{
		
	}
