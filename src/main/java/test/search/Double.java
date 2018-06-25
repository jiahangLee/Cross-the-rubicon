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
    //选择排序
    public static void selectSort(int[] a){
        int i,j,min,temp;
        for(i=0;i<a.length-1;i++){
            min = i;
            //这个j是随i变化的
            for(j=i+1;j<a.length;j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            if(min != i) {
                a[min] ^= a[i];
                a[i] ^= a[min];
                a[min] ^= a[i];
            }
        }
        for(int k:a){
            System.out.print(k+",");
        }
    }
    public static void quickSort(int[] a,int left,int right){
        int i = left;
        int j = right;
        if(left>right)
            return;
        int temp = a[left];
        while(i != j){
            while(i<j && a[j]>=temp){
                j--;
            }
            while(i<j && a[i]<=temp){
                i++;
            }
            if(i<j) {
                a[j] ^= a[i];
                a[i] ^= a[j];
                a[j] ^= a[i];
            }
        }
        a[left] = a[j];
        a[j] = temp;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);

    }
    public static void main(String[] args) {

//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
//        System.out.print(search(a, 11));

          int[] b = {5,3,1};
//          insertSort(b);
//            selectSort(b);
                quickSort(b,0,2);
                for(int i:b){
                    System.out.print(i+",");
                }
    }
}
