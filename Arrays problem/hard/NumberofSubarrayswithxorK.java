public class NumberofSubarrayswithxorK {
    public static void main(String[] args) {
        int [] arr = {5, 6, 7, 8, 9};
        int k =5;
        // System.err.println("Ans : : " + bruteForce(arr,k));
        System.err.println("Ans: : " + optimal(arr,k));
        //Output:2
    }
    static int bruteForce(int[] arr , int k){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i <  n; i++){
            int xor =0;//1
            for(int j  = i ; j < n ; j++){
                xor ^=arr[j];
                if(xor == k){
                    count++;
                }
                
                
            }
            
        }

        return count;
    }


    static int optimal(int[] arr , int k ){
        
    }
}
