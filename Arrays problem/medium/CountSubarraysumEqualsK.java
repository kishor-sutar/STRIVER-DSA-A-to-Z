public class CountSubarraysumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4} ;
        int k = 6;
        //bruteForce(arr,k);
        better(arr, k);
    }
    static void bruteForce(int[] arr , int k){
        int n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n ; i ++){
       
           for(int j =i; j <n ;j++){
            int sum = 0;
            for(int m  = i; m <=j ; m++){
                sum+=arr[m];
            }
            if(sum == k){
                count++;
            }
           }
        }


        System.err.println("Count  sum  = "+  count);
    }
    static void better(int[] arr , int k){
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum += arr[j];
                if (sum == k) {
                    count++;
                }

            }

        }

        System.err.println("Count  sum  = "+  count);
    }
    
}
