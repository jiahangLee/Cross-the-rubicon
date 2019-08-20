package new201908.p0;

import data.array.Array;

/**
 * @Auther: jiahangLee
 * @Date: 2019/8/20 16:01
 * @Description: //TODO
 * @version: V1.0
 */
public class P001 {
    public static void main(String[] args) {

        int[] arr = {23,12,78,99,67,43,11};
        selectSort(arr);

    }

    // 冒泡排序之选大的往后排
    public static void sort1(int[] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        for(int i:arr)
            System.out.println(i);
    }
    // 冒泡排序之选小的
    public static void sort2(int[] arr){
        for(int i=0;i<arr.length;i++)
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        for(int i:arr)
            System.out.println(i);
    }
    // 插入排序
    public static void insertSort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            for(int i:arr)
                System.out.println(i);
    }

    // 选择排序
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minValue = arr[i];
            int minIndex = i;
            // 这里可能当时迷糊了
            for(int j=i;j<arr.length-1;j++){
                if(minValue>arr[j+1]){
                    minValue = arr[j+1];
                    minIndex = j+1;
                }
            }
            if(minValue != arr[i] && minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minValue;
            }
        }
        for(int i:arr)
            System.out.println(i);
    }
}
