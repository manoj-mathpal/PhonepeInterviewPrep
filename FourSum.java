package phonePe;

import java.util.*;
import java.util.stream.Collectors;

public class FourSum {

    public static HashSet<int[]> set = new HashSet<>();

    public List<List<Integer>> permute(int[] ary, int target) {
        List<List<Integer>> permutations = new ArrayList<>();
        backTrack(permutations, ary, target, 0);
        return permutations;
    }

    public void backTrack(List<List<Integer>> permutations, int[] ary, int target, int start) {
        List<Integer> lstt = new ArrayList<>();
        if (start == ary.length) {
            permutations.add(toList(ary));
            findQuadruplets(toList(ary),target);
        }
        for (int i = start; i < ary.length; i++) {
            combine(i, start, ary);
            backTrack(permutations, ary, target, start + 1);
            combine(i, start, ary);
        }
    }

    private void combine(int i, int j, int[] ary) {
        int temp = ary[i];
        ary[i]=ary[j];
        ary[j]=temp;
    }

    private List<Integer> toList(int[] ary) {
        List<Integer> lst = new ArrayList<>();
        for (int x : ary)
            lst.add(x);
        return lst;
    }

    private void findQuadruplets(List<Integer> lst, int tar) {
        int end=lst.size()-1;  // -2 -1  4 5 2 0 1 2 3 -3  , end=9 , window=6
        int window=end-3;
        int isQuad=0;
        while(window<=end){
            int l=lst.get(end);
            isQuad+=lst.get(end);
            end--;
        }
         int[] ar = new int[4];
        int poi=0;
        if(isQuad==tar) {
            for (int p=window;p<lst.size();p++){
                ar[poi]=lst.get(p);
                poi++;
            }
        }
        Set<int[]> c = Arrays.asList(ar).stream().collect(Collectors.toSet());
        Iterator<int[]> iterator = c.iterator();
        while (iterator.hasNext()) {
            String element = Arrays.toString(Arrays.stream(iterator.next()).distinct().toArray());
            System.out.println(element);
        }


        //System.out.println(Arrays.toString(result.toArray()));

    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> permutations = new FourSum().permute(nums,0);

    }
    }