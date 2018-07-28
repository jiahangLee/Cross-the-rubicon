package test.subtotal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lijia on 2018/7/26.
 */
public class Rev {
    public static void main(String[] args){
//        String s= "hello  world,  a";
//        String str = "Look to the skies above London and you'll see the usual suspects rainclouds, plane and pigeons. But by the end of the year, you might just see something else.";
//        reverse6(str);
        int[] arr = {7,1,6,3,9,0,1};
        quickSort(arr,0,6);
        reverse8(arr,4);
    }
    public static void reverse1(){
        String s = "hello , world";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
    }
    public static void reverse2(String a){
        String reverse = "";
        int i = a.length();
        for(int j=0;j<i;j++){
            reverse = a.charAt(j) + reverse;
        }
                System.out.println(reverse);
    }
    public static void reverse3(String a){
        String reverse = "";
        char[] chars = a.toCharArray();
        for (int i=0;i<chars.length;i++){
            reverse = chars[i]+reverse;
        }
        System.out.println(reverse);
    }
    public static void reverse4(String s){
        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
           sb = sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
    public static void reverse5(String s){
        String[] arr = s.split("\\w+");
        String[] brr = s.split(",* +");
        String ss = "";
        for(int i=0,j=brr.length-1;j>=0;i++,j--){
            if(i<arr.length) {
                if ( arr[i].equals("")) {
                    i++;
                    ss = ss + brr[j] + arr[i];
                }else{
                    ss = ss+ brr[j]+arr[i];
                }
            }else{
                ss = ss+ brr[j];
            }
        }
        System.out.println(ss);
    }
    public static void reverse6(String ss){
        String s= ss;
        s.replaceAll("\'"," ");
        s.replaceAll(","," ");
        s.replaceAll(".'"," ");
        String[] sss = s.split(" +");
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(String i:sss){
            if(map.containsKey(i)){
                Integer io = map.get(i);
                io += 1;
                map.remove(i);
                map.put(i,io);
            }else{
                map.put(i,1);
                list.add(i);
            }
        }
        String maxKey = "";
        Integer maxValue = 1;
        for(String ssss:map.keySet()){
            if(map.get(ssss)>maxValue){
                maxKey = ssss;
                maxValue = map.get(ssss);
            }
        }
        System.out.println(maxKey+" \n "+maxValue);

    }
    public static void quickSort(int[] arr,int left,int right){
        int i= left;
        int j= right;
        if(left>right)
            return;
        int temp = arr[left];
        while(i != j){
            while(i<j && arr[j] >= temp)
                j--;
            while(i<j && arr[i] <= temp)
                i++;
            if(i < j){
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
            }
        }
        arr[left] = arr[j];
        arr[j] = temp;
        quickSort(arr, left, i-1);
        quickSort(arr, i+1, right);
    }
    public static void reverse8(int[] arr,int n){
        for(int i=0;i<n;i++)
            System.out.print(arr[arr.length-1-i]+",");
    }
}
