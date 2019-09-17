import java.util.Scanner;
public class Base16toBase10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		String b = input.next();
		
		char[] arr = new char[b.length()];
		int[] arr1 = new int[b.length()];
		double[] exp = new double[b.length()];
		int sum = 0;
		
		for(int i = b.length() - 1, f=0 ;f < arr.length;i--, f++) {
			arr[i] = b.charAt(i);
			if(Character.isDigit(arr[i])) {
				arr1[i] = Integer.parseInt(arr[i] + "");
			}else {
				if(Character.isLetter(arr[i]))
					arr1[i] = Integer.parseInt(arr[i] - 'A' + 10 + ""); 
			}
			exp[f] = Math.pow(16, i);
		}
		
		for(int i = 0;i < b.length(); i++) {
			if((exp[i] * arr1[i]) != 0)
				sum += exp[i] * arr1[i];
		}
		
		System.out.print(sum);

	}

}
