import java.util.Scanner;
public class revEachWordnSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int n = str.length();
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && str.charAt(j) != ' ') {
                j++;
            }
            reverse(str, i, j - 1);
            j++; 
            i = j;
        }
        System.out.println(str);
    }
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}