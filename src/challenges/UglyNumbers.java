package challenges;
import java.util.Scanner;
//Code to validate ugly numbers. Ugly numbers are numbers only divisible for 2, 3 and 5
public class UglyNumbers {
	public static boolean testUglyNumber(int number) {
		if (number==0) 
			return false;
		while (number>0) {
            if (number==1)
                return true;
			if (number%2==0) {
				number/=2;
			}
			else if(number%3==0) {
				number/=3;
			}
			else if(number%5==0) {
				number/=5;
			}
			else {
				return false;
			}
		}
		return true; 
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please, type a number: ");
		
		int number=s.nextInt();
		
		if (testUglyNumber(number)) {
			System.out.println("Ugly number found!");
		}
		else {
			System.out.println("Ugly number not found!");
		}
		
		s.close();
	}
}