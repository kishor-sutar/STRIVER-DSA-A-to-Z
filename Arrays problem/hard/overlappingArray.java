import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlappingArray {
    public static void main(String[] args) {
       int[][] interval = {{1,5},{3,6},{8,10,},{15,18}}; //Input: intervals = [[1,5],[3,6],[8,10],[15,18]]
        
       



        

        int [][] ans = bruteForce(interval);
        for(int i = 0 ; i < ans.length ; i++){
           System.out.print(ans[i][0] + " ," + ans[i][1]);
           System.out.println();
           
        }
        
        // better();
        // optimal();
    }
    public static int[][] bruteForce(int[][] interval){

    
    // 1. Sort - Needs a custom comparator for 2D arrays
    Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));
    
    int n = interval.length;
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        int start = interval[i][0];
        int end = interval[i][1];

        int j = i + 1;
        while (j < n) {
            if (interval[j][0] <= end) {
                end = Math.max(end, interval[j][1]);
            } else {
                break;
            }
            j++;
        }
        
        // Add current merged interval
        ans.add(Arrays.asList(start, end));

        // Jump the index
        i = j - 1; 
    }

    // Manual conversion to avoid the Error
    int[][] result = new int[ans.size()][2];
    for (int k = 0; k < ans.size(); k++) {
        result[k][0] = ans.get(k).get(0);
        result[k][1] = ans.get(k).get(1);
    }
    return result;

        
    }
    
}


/*
Input: intervals = [[1,5],[3,6],[8,10],[15,18]]

Output: [[1,6],[8,10],[15,18]]

Explanation: Intervals [1,5] and [3,6] overlap, so they are merged into [1,6].

=========================================================================================================================..
if we do as per the bruteForce we have to follow the following procedure 
========================================================================================================================..
Sort all intervals based on their starting points. This helps bring all overlapping intervals next to each other.

Go through each interval one by one and if the current interval is already covered by a previously merged interval,
skip it. Else, pick the current interval as the starting point of a new merged interval.

Now run another loop to check if the following intervals overlap with the current one

If the start of next interval is less than or equal to the end of the current merged interval, 
it means they overlap. Therefore, extend the end of the merged interval to be the maximum of the two ends.

Keep doing this for the next intervals as long as they overlap. 
As soon as you find an interval that doesn't overlap, break the inner loop and move back to the outer loop to process 
the next non-overlapping interval.

Store each merged interval in the final answer list and after the loop ends, return the list of merged intervals.



arr =[[1,5],[3,6],[8,10],[15,18]]
               0      1      2      3
sort.arr = > [[1,5],[3,6],[8,10],[15,18]]   , n=length of the arr whcihc is 4
                
ans  = > []
    0    
for i to n : 
     




*/
