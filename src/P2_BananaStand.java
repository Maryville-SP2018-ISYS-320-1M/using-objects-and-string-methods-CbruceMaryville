/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

public class P2_BananaStand {
	public static void main(String[] args) {
		LastHalf("There's always money in the banana stand.");

	}

	
	
	
	
	
	public static String LastHalf(String S) {
			//String quote = "There's always money in the banana stand.";
			int len;
			len = S.length();
			int len2;
			len2 = (len/2);
			
		//	System.out.println(S.substring(len2,41));
	// the system print works but why wont the return statement
		
			
			return (S.substring(len2,41));
	}

}
