import java.util.Scanner;

public class updatestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String = ");
        String inputStr = sc.nextLine();
        char[] arr = new char[inputStr.length()];
        char ch = inputStr.charAt(0);
        for(int i = 0; i<inputStr.length();i++){
            if (i%2==0) {
                ch = 'a';
            }
            else{
                ch = inputStr.charAt(i);
            }
            arr[i] = ch;
        }
        System.out.println(arr);
    }
}