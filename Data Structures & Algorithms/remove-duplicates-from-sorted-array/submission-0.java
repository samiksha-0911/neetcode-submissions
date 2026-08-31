class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1; // beco 1st element is always gonna be unique

        for(int i=1; i<=nums.length-1; i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    
        
    }
}