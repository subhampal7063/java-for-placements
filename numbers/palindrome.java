class palindrome {
    public static void main(String[] args) {
        int number = 123216;
        isPalindrome(number);
        
    }
    static void isPalindrome(int number){
        int num = number;
        int reverseNum = 0;
        while (num>0) {
            int lastDigit = num%10;
        reverseNum = reverseNum * 10 + lastDigit;
        num = num /10;
        }
        if (reverseNum == number) {
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}