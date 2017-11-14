import java.util.Scanner;

public class CipherMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Encode or decode (0/1):");
		String input = sc.nextLine();
		if (input.equals("0")) {
			System.out.println(CipherFunction.encode()); 
		}
		else {
			System.out.println(CipherFunction.decode());
		}
		sc.close();
	}
}
