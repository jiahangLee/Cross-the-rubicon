package test.search;

/**
 * Created by lijia on 2018/6/23.
 */
public class Double {
    //二分查找法
    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < key)
                start = mid + 1;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
    //插入排序
    public static void insertSort(int[] arr ){
        int insertNode;
        //从第二个数开始，比较n-1次，大的放后面
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            insertNode = arr[i];
            while (j>=0 && insertNode<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = insertNode;
        }
        for(int i:arr){
            System.out.print(i+",");
        }
    }
    public static void main(String[] args) {

//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
//        System.out.print(search(a, 11));

          int[] b = {3,15,35,1,6,89,65};
          insertSort(b);
    }
}
