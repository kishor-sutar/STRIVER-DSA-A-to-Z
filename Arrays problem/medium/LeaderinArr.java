import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderinArr{
    public static void main(String[] args) {
        int [] arr = {-3, 4, 5, 1, -30, -10};
        System.out.println(leaders(arr));

    }
    public static List<Integer> leaders(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        int n = nums.length;
        output.add(nums[n-1]);
        for(int i = n - 2;i>=0;i-- ){
            if(nums[i]>nums[i+1]){
                output.add(nums[i]);
            }
        }
        Collections.reverse(output);
        return output;
    }
}