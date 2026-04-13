class Solution {
    public void moveZeroes(int[] nums) {
        List l1 = new ArrayList();
        for(int a : nums){
            if(a != 0){
                l1.add(a);
            }
        }

        for(int i=0;i<l1.size();i++){
            nums[i] = (int)l1.get(i);
        }

        for(int i=l1.size();i<nums.length;i++){
            nums[i] = 0;
        }
    }
}