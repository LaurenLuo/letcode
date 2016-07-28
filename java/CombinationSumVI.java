
package combinationSum;
//No 373
public class CombinationSumVI {
	 public int combinationSum4(int[] nums, int target) {
		 //递归，耗时太长，不通过
		 int cnt=0;
		 for(int i=0;i<nums.length;i++){
			 if(target-nums[i]>0){
				 cnt+=combinationSum4(nums,target-nums[i]);
			 }else if(target-nums[i]==0){
				 cnt+=1;
			 }
		 }
		 return cnt;
	 }

	 public static void main(String[] args){
		 CombinationSumVI combinationSumVI=new CombinationSumVI();
		 int[] nums = {1,2,3};
		 System.out.print(combinationSumVI.combinationSum4(nums,4));
	 }
}

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] result=new int[target+1];
        for(int i=0;i<=target;i++){
            for(int j=0;j<nums.length;j++){
                if(i-nums[j]>0){
                    result[i]+=result[i-nums[j]];
                }else if(i-nums[j]==0){
                    result[i]+=1;
                }
            }
        }
        return result[target];
    }
    
}
