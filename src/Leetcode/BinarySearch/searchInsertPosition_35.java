package Leetcode.BinarySearch;

public class searchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        int r = searchInsert(nums,target);
        System.out.println(r);
    }
    public static int searchInsert(int[] nums, int target){
        int hi = nums.length-1;
        int lo = 0;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return lo;
    }
}
