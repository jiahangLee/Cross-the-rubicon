package test.search;

/**
 * Created by lijia on 2018/6/23.
 */
public class Double {
    public static int search(int[] arr, int key){
        int start = 0;
        int end  = arr.length;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] < key)
                start = mid + 1;
            else if(arr[mid] > key)
                end = mid -1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,11};
        System.out.print(search(a,11));
    }
}
