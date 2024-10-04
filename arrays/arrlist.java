import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(6);
        for (int i = 0; i < 15; i++) {
            arr.add(i,i*100);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(arr.get(i));
        }
    }
}
