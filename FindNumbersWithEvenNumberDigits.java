class Solution {
    public int findNumbers(int[] nums) {
        int len=nums.length;
        String temp;
        int count=0;
        for(int i=0;i<len;i++){
            temp=String.valueOf(nums[i]);
            if(temp.length()%2==0){
                count++;
                
            }
            
        }
        return count;
        
    }
}
