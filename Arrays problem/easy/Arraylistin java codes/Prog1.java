import java.util.ArrayList;
import java.util.Collections;

public class Prog1 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
      
        for(int i = 0 ; i < 3;i++){
            arr.add(new ArrayList<>(Collections.nCopies(3,-1)));
        }

        System.err.print(arr);

        

        
    }
    
}
