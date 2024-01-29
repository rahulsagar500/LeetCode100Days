class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int current=0;
        int max=0;
        int num=nums.length;
        for(int i=0;i<num;i++){
            if(nums[i]==1){
                current++;
                if(current>max){
                    max=current;
                }
            }
             else{
                 current =0;
             }   
            
        }
        return max;
        
        
       
            
        }
}
        
    
