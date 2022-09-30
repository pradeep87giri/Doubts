import java.util.Arrays;
public class binarysearch{
    public static void main(String args[]){
        int arr[]={2,4,6,1,8};
        int target=6;
        Arrays.sort(arr);
        
        int s=0;
        int e=arr.length-1;
        
        while(s<=e){
            
        
        int m = (s+(e-s))/2;
        if(arr[m]==target){
          System.out.print("found at"+target);
          break;
        }
        else if(arr[m]<target){
            s=m+1; 
        }
        else {
            e=m-1;
        }
    }
}
}

            
        
       
          