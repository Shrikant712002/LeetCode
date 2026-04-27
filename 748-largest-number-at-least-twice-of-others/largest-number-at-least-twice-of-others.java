class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int max2 = -1;
        int ind = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max2 = max;
                max = nums[i];
                ind = i;
            }
            else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return max >= (max2 * 2) ? ind : -1;
    }
}