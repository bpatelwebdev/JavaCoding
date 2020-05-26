package String;

public class CapitalizeString {
    public static void main(String[] args) {
        String statement = "hello bhavik how are you";
       /* for(int i = 0;i<statement.length();i++){
            char letter = statement.charAt(i);
           // System.out.println(letter);
            if(letter == ' '){
                System.out.println(statement.charAt(i+1));
            }

            //while (letter){
                System.out.println("index "+i);
            }*/
        String[] words = statement.split(" ");
        String returnStr ="";
        for (String word : words) {
            String newWord = word.substring(0,1).toUpperCase() + word.substring(1);
            returnStr += (newWord+" ");
        }
        System.out.println(returnStr);



    }
}
