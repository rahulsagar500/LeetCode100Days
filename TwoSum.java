import java.util.ArrayList;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] numbers=new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    numbers[0]=i;
                    numbers[1]=j;
                    break;
                }
                
            }
        }
        return numbers;
        
    }
}
