//import java.lang.reflect.Array;
//
///**
// * @Auther: jiahangLee
// * @Date: 2019/7/22 14:44
// * @Description: //TODO
// * @version: V1.0
// */
//public class Test1 {
//
//
//    public static void main(String[] args) {
//        int arr1[] = {9,3,7,1,4};
//        order2(arr1);
//    }
//
//    public static void order2(int arr2[]){
//        for(int i=0;i<arr2.length;i++){
//            for(int j=0;j<arr2.length-i-1;j++){
//                if(arr2[j]>arr2[j+1]){
//                    arr2[j]^=arr2[j+1];
//                    arr2[j+1]^=arr2[j];
//                    arr2[j]^=arr2[j+1];
//                }
//            }
//        }
//        for(int i:arr2)
//            System.out.println(i+",");
//    }
//    public static void order1(int arr[]){
//        System.out.println(arr.length);
//        for(int i=0;i<arr.length-1;i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i:arr){
//            System.out.print(i+",");
//        }
//    }
//}
