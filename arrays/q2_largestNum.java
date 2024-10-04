public class q2_largestNum {
    public static void main(String[] args){
        int arr[] = {-987654,-4,2,4,3,5,8,4,21,9,-6,-98765};
        System.out.println(largestNum(arr));

    }

    static int largestNum(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
