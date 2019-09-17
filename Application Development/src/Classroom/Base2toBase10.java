package Classroom;
import java.util.Scanner;
public class Base2toBase10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int a = input.nextInt();
		String b = a + "";
		
		int[] arr = new int[b.length()];
		double[] exp = new double[b.length()];
		int sum = 0;
		
		for(int i = b.length() - 1, f=0 ;a != 0;i--, f++, a/=10) {
			arr[i] = a%10;
			exp[f] = Math.pow(2, i);
		}
		
	
		for(int i = 0;i < b.length(); i++) {
			if((exp[i] * arr[i]) != 0)
				sum += exp[i] * arr[i];
		}
		
		System.out.print(sum);
	}

}
