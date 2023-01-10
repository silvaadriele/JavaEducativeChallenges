package challenges;
import java.util.ArrayList;
import java.util.Scanner;

public class SeparateEvenAndOdd {
	public ArrayList<Integer> separate(ArrayList<Integer> list){
		int left=0;
		int right=list.size()-1;
		for (int i = 0; i < list.size(); i++) {
		 
			while(list.get(left)%2==0)
				left++;
			while(list.get(right)%2==1)
				right--;
			if(left<right){
				int aux=list.get(left);
			   
				list.set(left, list.get(right));
				list.set(right,aux);
			}
		}
		return list;
		
	}
	public void printArray(ArrayList<Integer> list) {
		for (int element : list) {
			System.out.print(element + " ");
		}
	}
	
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		SeparateEvenAndOdd method = new SeparateEvenAndOdd();
		int element;
		
		System.out.println("Please, type the number os elements: ");
		int number = Integer.parseInt(s.nextLine());
		
		for (int i=0; i<number; i++) {
			System.out.println("Please, type the element "+(i+1));
			element = Integer.parseInt(s.nextLine());
			list.add(element);
		}
		System.out.println("Initial array");
		method.printArray(list);
		method.separate(list);
		System.out.println("\nFinal array");
		method.printArray(list);
		s.close();
	}
}
