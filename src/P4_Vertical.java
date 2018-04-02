/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

public class P4_Vertical {

	public static void main(String[] args) {
		Vertical("hey now");
	}
	
	
	
	

	public static void Vertical(String str){

	    if(str != null && !"".equals(str)){
	        int sLen = str.length();

	        for (int i=0; i<sLen; i++){
	            System.out.println(str.charAt(i));
	        }

	    }

	}

}
