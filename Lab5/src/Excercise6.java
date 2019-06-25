import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Excercise6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Salary");
		try{int salary=s.nextInt();
		if(salary<3000) {
			throw new EmployeeException();
		}
		else {
			System.out.println("Salary is Valid");
		}
		}catch(EmployeeException e) {
			System.out.println("Please Enter Valid Salary");
		}
}
}
