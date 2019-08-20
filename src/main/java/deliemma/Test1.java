package deliemma;

import java.util.*;

/**
 * @Auther: jiahangLee
 * @Date: 2019/7/25 00:57
 * @Description: //TODO
 * @version: V1.0
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,3,5};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public List<List<Integer>> threeSum(int[] nums) {
//        List<Integer> ret = new ArrayList<>();
        Set set = new HashSet();
        for(int i:nums)
            set.add(i);
        List<List<Integer>> ret = new ArrayList<>();
        for(int i=0;i<set.size();i++)
            for(int j=i+1;j<set.size();j++)
                for(int k=j+1;k<set.size();k++){
                    if(nums[i]+nums[j]+nums[k]==0){

                        List list = new ArrayList();
                        list.add(i);
                        list.add(j);
                        list.add(k);
                        ret.add(list);
                        return ret;
                    }
                }
                return ret;
    }
}
