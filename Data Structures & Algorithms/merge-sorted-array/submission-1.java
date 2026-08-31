class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i= m-1; //valid elements of nums1 [10,20,20,40]   starting 4 elements 
        int j=n-1; //valid elements of nums2
        int k=m+n-1; //last position of num1

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;

        } 
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }   
    }
}