import java.util.*; 
public class LengthOfMaxToys {
    public static void main(String[]args){
    int []arr={1, 12, 5, 111, 200, 1000, 10, 9, 12, 15 };
    int k=50;
    System.out.print(lengthOfToysPurchased(arr,k));
    }
    public static int lengthOfToysPurchased(int []arr,int k){
           Arrays.sort(arr);
           int c=0;
           int max=0;
           int sum=0;
           
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<=k){
                    c=j-i+1;
                    max=Math.max(c,max);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}
