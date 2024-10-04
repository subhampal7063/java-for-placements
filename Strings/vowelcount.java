import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' ||input.charAt(i) == 'e' || input.charAt(i) == 'i' ||input.charAt(i) == 'o'||input.charAt(i) == 'u' ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
