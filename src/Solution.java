import java.util.Arrays;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        Arrays.sort(nums);
        int w=0;
        for(int i=0;i<nums.length;i++){
            if(target<nums[0]){
                w=0;
                break;
            }else{
                if(target>nums[nums.length-1]){
                    w=nums.length;
                    break;
                }else{
                    if(nums[i]<target&&target<nums[i+1]){
                        w=i+1;
                        break;
                    }
                }
            }
        }
        return w;
    }
}
