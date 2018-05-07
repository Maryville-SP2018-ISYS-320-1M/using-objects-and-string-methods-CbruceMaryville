/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
	FIXED 5/6/2018
*/

public class P2_BananaStand {
	public static void main(String[] args) {
		System.out.println(LastHalf("There's always money in the banana stand."));

	}

	public static String LastHalf(String S) {
		int len;
		len = S.length();
		int len2;
		len2 = (len / 2);

		String finalString = (S.substring(len2, 41));

		return (finalString);
	}

}
