import java.util.Scanner;
public class Excercise4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Enter First Name");
		String firstName=s.next();
		System.out.println("Enter Last Name");
		String lastName=s.next();
		if(firstName=="") {
			throw new FirstNameException();
		}
		if(lastName=="") {
			throw new LastNameException();
		}
		}catch(FirstNameException e) {
			System.out.println("First Name Cannot Be Null");
		}
		catch(LastNameException e) {
			System.out.println("Last Name Cannot Be Null");
		}

	}

}
class FirstNameException extends Exception {
	
}
class LastNameException extends Exception {
	
}
