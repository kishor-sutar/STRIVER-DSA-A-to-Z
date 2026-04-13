import java.util.ArrayList;

public class Rotateclockwise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        bruteForce(arr);
    }

    public static void bruteForce(int[][] arr){
        int n= arr.length;
        
        int[][] ans = new int[n][n];
        for(int i = 0; i<n;i++)
        {
           
            for(int j = 0 ; j < n; j++){
                
                ans[j][n-1-i]=arr[i][j];

            }
          
            
        }

        for(int i = 0 ; i <  n;i++){
            for(int j = 0 ; j < n ; j++){
                System.err.print(ans[i][j]);
            }
            System.err.println();
          
        }
        
    }

    public static void optimal(int[][] arr){
        int n = arr.length;
        //transopse the matrix

        for(int i = 0 ;i < n - 2;i++){
            for(int j = i+1; j < n -1;j++){
                arr[i][j] = arr[i][j] ^ arr[j][i];
                arr[j][i] =  arr[i][j]  ^ arr[j][i];
                arr[i][i] = arr[i][j] ^ arr[j][i];
            }
        }

        for(int i = 0 ; i < n; i++){
            int left = arr[i].length - 1;
            int right = 0;
            
            while (right < left) {
                
                arr[i][right] =  arr[i][right] ^ arr[i][left];
                arr[i][left]  = arr[i][right] ^ arr[i][left];
                arr[i][right] =  arr[i][right] ^ arr[i][left];
                left--;
                right++;

            }
        }

        
    }

    
    
}
