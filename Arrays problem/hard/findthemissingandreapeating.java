import java.util.Arrays;

class findthemissingandreapeating{
    public static void main(String[] args) {
        int [] nums = {3,5,4,1,1};
        int[]sol = brute(nums);

        for(int n:sol){
            System.out.print(n+" ");
        }
        System.out.println();
        
    }
    public static int[] brute(int[] nums){
        int[] temp = nums.clone();
        int n = temp.length;
        Arrays.sort(temp);
        int[] ans = new int[2]; 
        //{1,1,3,4,5}
        int sumtemp  = 0; 
        for(int i = 0; i < n;i++){
            sumtemp = temp[i] + sumtemp;
            if(i > 0 && temp[i] == temp[i-1]){
                ans[0] = temp[i];
            }
        }
        int expectedSum  = n * (n + 1) / 2;
        ans[1] = expectedSum - (sumtemp - ans[0]);
        return ans; 
    }
}