package array;

import org.apache.logging.log4j.core.util.JsonUtils;
import org.w3c.dom.ls.LSOutput;
import vm.VendingMachine;

public class Practices {
    public static void main(String []args){

        int[] nums = {2, 1, 2, 3, 4};
        System.out.println(countEvens(nums));
    }
    public static int countEvens(int[] nums) {

        int count = 0;
        for(int i =0;i<=nums.length-1;i++){
            if(nums[i]%2==0){
                count= count+1;

            }
        }
        return count;
    }

}
