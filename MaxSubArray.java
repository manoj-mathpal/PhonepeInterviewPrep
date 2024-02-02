package phonePe;

public class MaxSubArray {
        public int maxSubArray(int[] nums) {
            if(nums.length==1) return nums[0];
            if(nums.length==2){
                if(nums[0]<0 && nums[0]<nums[1]) return nums[1];
                if(nums[1]<0 && nums[1]<nums[0]) return nums[0];
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length-1;i++){
                max=Math.max(nums[i],max);
                int sum=nums[i];
                int j=i+1;
                while(j<nums.length){
                    sum+=nums[j];
                    max=Math.max(sum,max);
                    j++;
                }
            }
            max=Math.max(max,nums[nums.length-1]);
            return max;
        }

    public static void main(String[] args) {

    }
}
