public class findAllPalindrome {
    public static void main(String[] args) {
        int range = 10000;
        for(int i = 1;i<=range;i++){
            if(isPalindrome(i) == true){
                System.out.print(i+" ");
            }else{
                continue;
            }
        }
    }
    static boolean isPalindrome(int number){
        int num = number;
        int reverseNum = 0;
        while (num>0) {
            int lastDigit = num%10;
        reverseNum = reverseNum * 10 + lastDigit;
        num = num /10;
        }
        if (reverseNum == number) {
            return true;
        }
        else{
            return false;
        }
    }
}