package phonePe;

public class RobberyProblem {
    public int robNew(int[] nums) {
        int maxRobbed = 0;
        int maxNotRobbed = 0;
        for(int num: nums) {
            int curRob = maxNotRobbed + num;
            int curNoRob = Math.max(maxNotRobbed, maxRobbed);
            maxRobbed = curRob;
            maxNotRobbed = curNoRob;
        }
        return Math.max(maxRobbed, maxNotRobbed);
    }

    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        System.out.println(new RobberyProblem().robNew(arr));
    }

}
