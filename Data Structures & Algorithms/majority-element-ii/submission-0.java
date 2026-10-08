class Solution {
    public List<Integer> majorityElement(int[] nums) {
       // int count=0;   it should be inside i loop bcoz every new i it will take count =0 , if it is outside the loop.
    //So after checking the first number, count keeps its old value when you check the next number.
    List<Integer> result =  new ArrayList<>();
    int n = nums.length;
        for(int i=0; i<n;i++){
              int count=0;
            for(int j=0; j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count>n/3  && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
        
    }
}