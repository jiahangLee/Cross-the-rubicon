/**
 * @Auther: jiahangLee
 * @Date: 2019/7/22 16:01
 * @Description: //TODO
 * @version: V1.0
 */
public class test2 {

    //冒泡排序，选择最大的在最后
    public static void main(String[] args){

        int arr[] = {2,9,6,3,23,67,1,97,22};
        selectSort(arr);
    }
    public static void sort(int[] arr){
        System.out.println(arr.length);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]^=arr[j+1];
                    arr[j+1]^=arr[j];
                    arr[j]^=arr[j+1];
                }
            }
        }
        for(int i:arr)
        System.out.print(i+",");
    }
    //选择排序 选择最小的数的索引记下
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i:arr)
            System.out.print(i+",");
    }
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int ele = arr[i];
            if(arr[i]<arr[i-1]){
                ele = arr[i];
                arr[i] = arr[i-1];
                int j =i-1;
                while(j>0 && ele>arr[j-1]){
                    arr[j-1] = ele;
                    ele = arr[j-1];
                    j--;
                }
            }
        }
    }
}
