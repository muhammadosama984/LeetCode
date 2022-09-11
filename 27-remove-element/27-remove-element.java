class Solution {
    public int removeElement(int[] nums, int val) {
       int end = nums.length-1;
       int start = 0;
        int count = 0;
       
        
        while(start <= end){
            if (nums[start] == val &&  nums[start] != nums[end]){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                start++;
                count++;
            }
            else if(nums[start] == val  &&  nums[start] == nums[end]){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                count++;
            }
            else{
                start++;
            }
        }
        return nums.length - count;
    }
}