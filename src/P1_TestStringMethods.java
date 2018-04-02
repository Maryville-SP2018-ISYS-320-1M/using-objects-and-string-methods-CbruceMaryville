/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

/*
 Your expression predictions:
 
1. 13
2.a
3.G
4.2

5.GANDALF THE GRAY
6.frodo baggins
7.o Baggins
8.dalf the GR

9.Goondoolf the GRAY
10Gandalf the GRAY
11.strange1
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 I was correct, I learned what a substring, char at and replace does. I had to use a java 
 site forum to learn what they did. Once I understood it was just simply thinking it out to get 
 the right answers.
 
 */
public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println( str1.length() );
		System.out.println( str1.charAt(7) );
		System.out.println( str2.charAt(0) );
		System.out.println(str1.indexOf("o")   );
		System.out.println( str2.toUpperCase() );
		System.out.println( str1.toLowerCase() );
		System.out.println(str1.substring(4)   );
		System.out.println( str2.substring(3, 14) );
		System.out.println( str2.replace( "a", "oo") );
		System.out.println(str2.replace("gray", "white")  );
		System.out.println("str1".replace("r",  "range") );
	}

}
