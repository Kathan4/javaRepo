package leetCode;

public class easyReverseString344 {
	


	public static void main(String[] args) {
	
		ReverseString(['h','e','e','l','o']);

	}



	public static void ReverseString(char[] s) {
	        
	        int left=0;
	        int right = s.length-1;
	        
	        while(left <= right){
	            char temp = s[left];
	            s[left] = s[right];
	            s[right] = temp;
	            
	            left += 1;
	            right += 1;
	        }
	            
	    }

}
