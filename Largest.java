import java.util.*;
public class Largest {
    public static void main(String[]args){
        int arr[]={2, 3, 1, 2, 4, 3};
        int k=7;
        System.out.print(longConsecutivelength(arr, k));
    }
       public static int longConsecutivelength(int []arr,int k){
        int min=arr.length-1;
        int c=0;
        int sum=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=k){
                c=i-left+1;
                sum=sum-arr[left];
                left++;
                min=Math.min(min,c);
            }
        
        }
        return min;
    }
}
       