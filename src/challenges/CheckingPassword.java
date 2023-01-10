package challenges;
import java.util.Scanner;

/*Code to check if a given password is valid. To be valid it needs to adhere to the following rules:
 * The password must have at least 8 characters, at least 2 digits and letters*/

public class CheckingPassword {
	static int letters=0;
	static int digits=0;
	private static boolean checkPassword(String password) {
		if (password.length()<8)
			return false;
		
		
		for (int i=0; i<password.length(); i++) {
			if (Character.isLetter(password.charAt(i)))
				letters++;
			else if(Character.isDigit(password.charAt(i)))
				digits++;
			else
				return false;
		}
		if (digits>=2)
			return true;
		return false;
		
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Please, type a password to check if it is valid: ");
		
		String password=s.nextLine();
		
		if (checkPassword(password.toLowerCase()))
			System.out.println("Perfect, the password is valid. ");
		else
			System.out.println("That's incorrect. Your password is not valid. ");
		s.close();
	}
	
}
