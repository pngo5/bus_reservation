import java.util.Scanner;
public class Base10toBase16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int num = input.nextInt();
		int rem;
		String a = "";
		for(;num != 0;num /= 16) {
			rem = num % 16;
			if(rem >= 9 && rem <=15) {
				a += (char)('A' + rem-10);
				continue;
			}
			a += rem;
		}

		String[] arr = new String[a.length()];
		
		for(int i = 0; i<a.length() ;i++) {	
			arr[i] = a.charAt(a.length()-i -1) + "";
			System.out.print(arr[i]);
		}
	}

}

