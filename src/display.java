import java.util.Scanner;

public class display {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		user userObject = new user();
		System.out.println("What is your name? ");
		String nameVar = input.nextLine();
		userObject.setName(nameVar);
		System.out.println("What is your address? ");
		String addressVar = input.nextLine();
		userObject.setAddress(addressVar);
		System.out.println("What is your email? ");
		String emailVar = input.nextLine();
		userObject.setEmail(emailVar);
		System.out.println("What is your phone number? ");
		String phoneNumberVar = input.nextLine();
		userObject.setPhoneNumber(phoneNumberVar);
		System.out.println("What is your income? ");
		String incomeVar = input.nextLine();
		userObject.setIncome(incomeVar);
		System.out.println("Who is your employer? ");
		String employerVar = input.nextLine();
		userObject.setEmployer(employerVar);
		userObject.finalInfo();
	}
}
