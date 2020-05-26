package String;

import com.example.WhileLoop;

import java.util.Scanner;

public class CountTripplet {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String statement =  scanner.nextLine();
        int count = 0;
        for (int i=0;i<statement.length()-2;i++){
            if(statement.charAt(i)==statement.charAt(i+1) && statement.charAt(i+1)==statement.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count + " tripltes found");

    }

}
