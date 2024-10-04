import java.util.Scanner;

public class strBuilderFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str.reverse());
        str.setCharAt(2, 'r');
        System.out.println(str);
    }
}