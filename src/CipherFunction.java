import java.util.Scanner;

/**
 * 
 * 
 * @author Colin Jikyung Kim
 *
 */
public class CipherFunction {

	public static String decode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Decoding");
		System.out.print("String to decode:");
		String s = sc.nextLine();
		s = reverse(s);
		s = hextoascii(s);
		s = addSpace(s);
		s= hextoascii(s);
		return s;
	}
	/*
	 * Encoding steps customizable
	 * 
	 * @param String s
	 * 
	 * @return encoded String s
	 */
	public static String encode(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Encoding");
		System.out.print("String to encode:");
		String s = sc.nextLine();
		s = toascii(s);
		s = toascii(s);
		s = reverse(s);
		s = addSpace(s);
		
		return s;
	}
	/*
	 * change string s to string ascii values
	 * 
	 * @param String s
	 * 
	 * @return String s in ascii
	 */
	private static String toascii(String s) {
		String temp="";
		int len = s.length();
		
		for (int i =0; i< len; i++) {
			int decAscii = (int) s.charAt(i);
			String hex = Integer.toHexString(decAscii);
			temp += hex;
		}
		s = temp;
		return s;
	}
	
	/*
	 * String s to turning hex to ascii value
	 * 
	 * @param String s
	 * 
	 * @return String s formatted to ascii
	 */
	private static String hextoascii(String s) {
		String[] sarray = s.split(" ");
		StringBuilder temp = new StringBuilder("");
		
		for (int i = 0;i < sarray.length; i++) {
			char dec = (char)Integer.parseInt(sarray[i],16);
			temp.append(dec);
		}
		
		s = temp.toString();
		return s;
	}
	
	
	/*
	 * reverses string s 
	 * 
	 * @param String s
	 * 
	 * @return String s reversed
	 */
	private static String reverse(String s) {
		char[] c= s.toCharArray();
		int start = 0, end = c.length-1;
		char temp;
		while(end>start){
	        temp = c[start];
	        c[start]=c[end];
	        c[end] = temp;
	        end--;
	        start++;
	    }
		s = new String(c);
		return s;
	}
	
	/*
	 * format String s to two hexval + space
	 * 
	 * @param String s
	 * 
	 * @return String s formatted with space
	 */
	private static String addSpace(String s) {
		char[] c= s.toCharArray();
		int len = c.length;
		int j = 0;
		String temp = "";
		for (int i = 0; i < len; i++) {
			if (j==2) {
				temp+= " ";
				temp+=c[i];
				j =1;
			}
			else {
				temp+= c[i];
				j+=1;
			}
		}
		return s = temp;
	}

	
}
