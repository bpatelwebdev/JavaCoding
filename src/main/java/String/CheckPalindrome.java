package String;

public class CheckPalindrome {
    public static void main(String[] args) {
        String statement =  "radar";
        int number = statement.length()/2;
        boolean isPalindrome = true;
        for (int i=0;i<number;i++){
            String frontLetter = statement.charAt(i) + "";
            String backLetter = statement.charAt(statement.length()-i-1) + "";
            if(!frontLetter.equals(backLetter)){
                isPalindrome = false;
            }
        }
        if(isPalindrome) {
            System.out.println("it is palindrome string");
        }else{
            System.out.println("not palindrome");
        }

    }

}
