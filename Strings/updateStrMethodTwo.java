import java.util.Scanner;

public class updateStrMethodTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String newStr = "";
        for(int i = 0;i<inputStr.length();i++){
            if (i%2==0) {
                newStr = newStr + 'a';
                
            }
            else{
                newStr = newStr + inputStr.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}