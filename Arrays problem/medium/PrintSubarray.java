public class PrintSubarray {
    public static void main(String[] args) {
        int arr[] = {9,-3,3,-1,6,-5};
        int len = 0;
        
        for(int i  = 0 ; i < arr.length ;i ++){
            for(int j  =  i ; j < arr.length; j++){
                for(int k = i ; k <= j ; k++){
                    len =  j-i+1;
                    System.err.print(arr[k] + " ");
                }
                
                System.err.println(len);
                
            }
            
            
        }

    }
    
}
