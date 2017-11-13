/**
 * 
 * 
 * @author Colin Jikyung Kim
 *
 */
public class CipherFunction {

	public static String decode(String s) {
		
		return s;
	}
	/*
	 * Encoding steps customizable
	 * 
	 * @param String s
	 * 
	 * @return encoded String s
	 */
	public static String encode(String s){
		s = toascii(s);
		s = toascii(s);
		char[] c = reverse(s);
		s = strFormat(c);
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
	 * reverses string s 
	 * 
	 * @param String s
	 * 
	 * @return String s reversed
	 */
	private static char[] reverse(String s) {
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
		
		return c;
	}
	
	/*
	 * format String s to two hexval + space
	 * 
	 * @param String s
	 * 
	 * @return String s formatted with space
	 */
	private static String strFormat(char[] c) {
		int len = c.length;
		int j = 0;
		String s = "";
		for (int i = 0; i < len; i++) {
			if (j==2) {
				s+= " ";
			    s+=c[i];
				j =1;
			}
			else {
				s+= c[i];
				j+=1;
			}
		}
		return s;
	}
}
