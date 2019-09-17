import java.util.Scanner;
// base10 to base2
public class Base10toBase2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int num = input.nextInt();
		int rem;
		String a = "";
		for(;num != 0;num /= 2) {
			rem = num % 2;
			a += rem;
		}
		
		String[] arr = new String[a.length()];
		
		for(int i = 0; i<a.length() ;i++) {
			arr[i] = a.charAt(a.length()-i -1) + "";
			System.out.print(arr[i]);
		}
		}

}
