import java.util.ArrayList;
import java.util.HashMap;

public class majorityArray1 {
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,2,2,4,1,3,3};
        System.out.println(bruteForce(arr).toString());
    }

    public static ArrayList<Integer> bruteForce(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }

        map.forEach((key,value)->{
            if(map.get(key) > n/3){
                ans.add(key);
            }
        });

        return ans;
    }
    
}
