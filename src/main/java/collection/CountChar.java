package collection;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountChar {
    public static void main(String[] args){
/// find number of days of specific weekday in each month for year 2020
      // Map<String,Map<String,Integer>> result = ;

// return passed student from given list of student with 3 subject marks criteria is avg > 50 each subject mark>40
        Map<String,Map<String,Integer>> finalResult = scanStudents();

        String sentence = "We are learning Java collection in map,treemap,hashmap";

        Map<Character,Integer> res = getCharacterCounty(sentence);
        for (Character character : res.keySet()) {
            System.out.println(character+":"+res.get(character));
        }

        String[] result = getPatterns("KIRTESH");
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static Map<String, Map<String, Integer>> getStudents() {
        Map<String, Map<String ,Integer>> studentMap = new HashMap<>();
        String[] students = {"student 1","student 2","student 3","student 4","student5"};
        int[][] marks = {{45,46,47},{50,51,52},{65,66,68},{75,76,78},{85,86,88}};
        for (int i = 0; i < students.length; i++) {
            Map<String,Integer> marksMap = new HashMap<>();
            marksMap.put("PHY",marks[i][0]);
            marksMap.put("CHEM",marks[i][1]);
            marksMap.put("MATH",marks[i][2]);
            studentMap.put(students[i],marksMap);
        }
        return  studentMap;
    }
    private static Map<String, Map<String, Integer>> scanStudents() {
        Map<String, Map<String, Integer>> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Students?");
        int numberOfStudent = scanner.nextInt();
        for(int i=1;i<=numberOfStudent;i++){
            System.out.println("Give the name of the student "+i);
            String name = scanner.next();
            System.out.println("PHY ");
            int phy = scanner.nextInt();
            System.out.println("CHY ");
            int chy = scanner.nextInt();
            System.out.println("MATH ");
            int math = scanner.nextInt();
            Map<String,Integer> marksMap = new HashMap<>();
            marksMap.put("phy",phy);
            marksMap.put("chy",chy);
            marksMap.put("math",math);
            studentMap.put(name,marksMap);
        }

        return studentMap;

    }



        public static String[] getPatterns(String str){
        String[] result = new String[str.length()];
        for (int x=0;x<str.length();x++){
            result[x]=str;
            str = str.substring(1)+str.charAt(0);
        }
        return result;
    }

    public static Map<Character,Integer> getCharacterCounty(String myStr){
        char[] letters = myStr.toCharArray();
        Map<Character,Integer> okResult = new HashMap<>();
        for (char letter:letters) {
            if(okResult.containsKey(letter)){
                int count = okResult.get(letter)+1;
                okResult.put(letter,count);
            }else{
                okResult.put(letter,1);
            }
        }
        return okResult;

    }
}
