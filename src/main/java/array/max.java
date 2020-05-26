package array;

public class max {
    public static void main(String[] args) {
        int array[] = new int[]{10, 11, 88, 2, 12, 120};
        int max = getMax(array);
        System.out.println("Maximun value is :"+max);
        int min = getMin(array);
        System.out.println("Minimum value is :"+min);

    }

    private static int getMin(int[] inputArray) {
        int minvalue = inputArray[0];
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]<minvalue){
                minvalue = inputArray[i];
            }
        }
        return minvalue;
    }

    public static int getMax(int[] inputArray){
            int maxvalue = inputArray[0];
            for(int i=0;i<inputArray.length;i++){
                if(inputArray[i]>maxvalue){
                    maxvalue=inputArray[i];
                }
            }
            return maxvalue;
        }
}
