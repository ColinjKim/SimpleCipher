/**
 * 
 * 
 * @author Colin Jikyung Kim
 *
 */
public class CipherFunction {

	public static String decode(String s) {
		s = reverse(s);
		s = totext(s);
		s = totext(s);
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
	
	private static String totext(String s) {
		String[] sarray = s.split("\\s+");
		StringBuilder temp = new StringBuilder("");
		
		for (int i = 0;i < sarray.length; i+=2) {
			temp.append((char) Integer.parseInt(sarray[i],16)+" ");
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
	/*
	 * format String s by removing all spaces
	 * 
	 * @param String s
	 * 
	 * @return String s formatted without space
	 */
	
	/*
	private static String removeSpace(String s) {
		char[] c= s.toCharArray();
		int len = c.length;
		int j = 0;
		String temp = "";
		for (int i = 0; i < len; i++) {
			if (j==2) {
				j =1;
				
			}
			else {
				temp+= c[i];
				j+=1;
			}
		}
		return s = temp;
	}
	*/
}
