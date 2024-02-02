//package phonePe;
//
//public class Interview {
//
//
//
//    // arr = [3,2,1,5,6,9,7].  sum = 14
//// o/p = {1,4}
//// Main class should be named 'Solution' and should not be public.
//
//        public void findSumSubArray(int[] nums, int target){
//            int i=0;
//            int j=1;
//            int maxSum=0;
//            int sum=nums[0];
//            for(;i<nums.length-1;){
//                sum+=nums[j];
//                if(sum==target) {
//                    System.out.println(i + " " + j);
//                    break;
//                }
//                if(j==nums.length-1){
//                    i++;
//                    j=i+1;
//                    sum=nums[i];
//                }
//                else{
//                    j++;
//                }
//            }
//            Character.isUpperCase()
//
//        }
//
//
//
//
////        public void groupAnagram(String[] arr){
////            HashMap<String,List<String>> map = new HashMap();
////            for(String str : arr){
////                char[] ch = str.toCharArray();
////                Arrays.sort(ch);
////                String st = new String(ch);
////
////                if(!map.containsKey(st)){
////                    map.put(st, new ArrayList<>());
////                }
////                map.get(st).add(str);
////            }
////            for(int i=0;i<map.size();i++){
////                System.out.println(map.values());
////            }
////
////
////        }
//
//        public static void main(String[] args) {
//            int[] arr ={3,2,1,5,6,9,7};
////            String[] ary ={"cat","bat","tac","tab","act","get"};
//
//              int target=14;
//            new Interview().findSumSubArray(arr, target);
//        }
//
//
//    }
