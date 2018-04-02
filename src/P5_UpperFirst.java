/*
	ISYS 320
	Name(s):Clayton Bruce	
	Date: 4/1/2018
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		UpFirst("super rainbow", "");
	}
	//******** CANT GET TO WORK PROPERLY GOING TO MOVE ON
	// can't figure away to split using the delimiter
	// Also my return statements are not doing what I intend
	// Will ask monday!

	public static void UpFirst(String s1, String s2) {
		// using A C++ style container here for ease

		String[] splits1 = s1.split("\\s+");

		//
		for (int i = 0; i < splits1.length; i++) {
			if (splits1[i].equals(" ")) {

				String p1;
				p1 = splits1[0];

				String p2;
				p2 = splits1[1];
				System.out.println(p1.toUpperCase() + " " + p2);
			} else {

				System.out.println("Just a single word");
			}

		}
		//

		/*
		 * String p1; p1 =splits1[0];
		 * 
		 * String p2; p2 =splits1[1];
		 */

		// System.out.println(p1.toUpperCase() +" "+ p2);

	}

}
