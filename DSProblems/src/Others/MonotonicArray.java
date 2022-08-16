package Others;

public class MonotonicArray {
	
	
	@SuppressWarnings("unused")
	private static boolean monotonicArray() {
		
		int nums[] = {1,2,3,3,6};
		boolean increase = true;
		boolean decrease = true;
			    for(int i =0; i < nums.length-1; i++){
			        if(nums[i] < nums[i+1]) return false;
			        if(nums[i] > nums[i+1]) return false;
			    }
			    return increase || decrease;
		}

	public static void main(String[] args) {
		
	monotonicArray();

	}
}
