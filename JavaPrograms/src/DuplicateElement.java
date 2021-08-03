// This function removes the duplicate elements in the sorted array. 
//  Solved this program in leetcode. This function does not need extra space.

class DuplicateElement {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0 || nums.length == 1){
            return nums.length;
        }
        int j=0;
        for(int i =0 ; i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            nums[j++]=nums[i];
        }
            }
        nums[j++]=nums[nums.length-1];
        return j;
    }
}