package challenges;
import java.util.Scanner;
// Code to rotate the given array twice in a clockwise direction.
public class RotateArray {
	
	public int[] rotate(int[] array) {
		int[] arr = new int[array.length];
		arr[0]= array[array.length-2];
		arr[1]= array[array.length-1];
		int counter =0;
		for (int i=2; i<arr.length; i++)
			arr[i]=array[counter++];
		return arr;
	}
	public void printArr(int[] arr) {
		System.out.print("[");
		for (int i=0; i<arr.length; i++) {
			if (i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+"," );
		}
		System.out.print("]");
	}
	
	public static void main(String args[]) {
		RotateArray a = new RotateArray();
		Scanner s = new Scanner(System.in);
		System.out.println("Type the size of the array: ");
		int arrSize = Integer.parseInt(s.nextLine());
		int[] array = new int[arrSize];
		for (int i=0; i<arrSize; i++) {
			System.out.println("Type the element "+(i+1));
			array[i] = Integer.parseInt(s.nextLine());
		}
		a.printArr(a.rotate(array));
		
		
		
	}
}
