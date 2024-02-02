package phonePe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class LongestIncreasingSubsequence {

    TreeMap<Integer, List<Integer>> map = new TreeMap(Collections.reverseOrder());

    public int lengthOfLIS(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            List<Integer> lst = new ArrayList<>();
            int p=i;
            j = p + 1;
            while (j <=nums.length-1) {
                if (nums[p] < nums[j]) {
                    lst.add(nums[p]);
                    if(j<nums.length-1 && nums[j+1]<nums[j] && j<nums.length/2) p=j+1;
                    else p = j;
                }
                if (j==nums.length-1) {
                    lst.add(nums[p]);
                    map.put(lst.size(), lst);
                    break;
                }
                j++;
            }
        }
        return map.firstKey();
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,7,9,4,10,5,6};
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(nums));

    }
}
