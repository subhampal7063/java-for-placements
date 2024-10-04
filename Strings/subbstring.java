public class subbstring {
    public static void main(String[] args) {
        String name = "abcde";
        for(int i = 0; i<name.length();i++){
            for(int j = i+1; j<5;j++){
                System.out.print(name.substring(i,j)+" ");
            }
            System.out.println();
        }
        
    }
}
