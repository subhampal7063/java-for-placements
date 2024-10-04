import java.util.Scanner;
public class countingvowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        int count = 0;
        for(int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            
            if (isVowel(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if (ch == 'a'|| ch == 'A') return true;
        if (ch == 'b'|| ch == 'B') return true;
        if (ch == 'c'|| ch == 'C') return true;
        if (ch == 'd'|| ch == 'D') return true;
        if (ch == 'e'|| ch == 'E') return true;
        else return false;
    }
}
