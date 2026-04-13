
public class reversethearr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int left = arr[i].length - 1;
            int right = 0;
            while (right < left) {
                arr[i][right] = arr[i][right] ^ arr[i][left];
                arr[i][left] = arr[i][right] ^ arr[i][left];
                arr[i][right] = arr[i][right] ^ arr[i][left];
                left--;
                right++;

            }

        }

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n;j++){
                System.err.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

}
