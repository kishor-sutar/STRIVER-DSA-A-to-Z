import java.util.ArrayList;
import java.util.HashMap;

public class LargestSubArrayWithSumToZero {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> bruteforce(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<ArrayList<Integer>,Integer> map = new HashMap<>();
        

        //code 
        return ans;

    }

    public static ArrayList<Integer> optimal(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        //code 
        return ans;

    }
    
}

/**
 * 
Example 1:
Input:
 N = 6, array[] = {9, -3, 3, -1, 6, -5}  
Result:
 5  
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.

Example 2:
Input:
 N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}  
Result:
 8  
Explanation:
 Subarrays with sum zero:
- {-2, 2}
- {-8, 1, 7}
- {-2, 2, -8, 1, 7}
- {6, -2, 2, -8, 1, 7, 4, -10}
The length of the longest subarray with sum zero is 8
 */
