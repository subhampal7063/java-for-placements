import java.util.*;

class q1_smallestnum{

    public static void main(String[] args){
        int arr[] = {-987654,-4,2,4,3,5,8,4,21,9,-6,-98765};

        System.out.println(smallestnum(arr));
    }
    static int smallestnum(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    
}