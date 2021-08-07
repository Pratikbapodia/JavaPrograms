
public class MaximumDivisibleNumber {

	public static void main(String[] args) {
		
		int count=0, max = 0;
		int[] nums = {8,1,28,4,2,6,7};
		
		for(int i = nums.length-1; i>0;i--) {
			for( int j = i-1;j>=0;j--) {
				if(nums[j]%nums[i]==0) {
					System.out.println(nums[j]+ "/"+ nums[i]);
					count++;
					System.out.println(count);
				}
				if(count>max) {
					max = count;
					count = 0;
				}
			}
		}
		System.out.println(max);
	}

}
