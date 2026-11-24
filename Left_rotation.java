import java.util.Arrays;

public class Left_rotation {
    public static void main(String[]args){
    
        
        int[] arr={1,2,3,4,5};
        int [] arr2=leftRotation(arr);
       System.out.print(Arrays.toString(arr2));
    }
    static int [] leftRotation(int[]arr){
        
        int []arr1=new int[arr.length];
        for (int i=1;i<arr.length;i++){
                 arr1[i-1]=arr[i];
        }
        arr1[arr1.length-1]=arr[0];
        return arr1;
    }
}
