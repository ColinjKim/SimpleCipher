import java.util.Scanner;

public class CipherMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Encode or decode (0/1):");
		String input = sc.nextLine();
		System.out.println("String to encode:");
		String s = sc.nextLine();
		if (input.equals("0")) {
			System.out.println("Encoding");
			System.out.println(CipherFunction.encode(s)); 
		}
		else {
			System.out.println("Decoding");
			System.out.println(CipherFunction.decode(s));
		}
		
	}
}
