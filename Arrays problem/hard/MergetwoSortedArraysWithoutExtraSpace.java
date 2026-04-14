public class MergetwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int[] nums1 = { -5, -2, 4, 5, 0, 0, 0 };
        int[] nums2 = { -3, 1, 8 };
        // Output : [-5, -3, -2, 1, 4, 5, 8]
        brutforce(nums1, nums2);



    }

    public static int[] brutforce(int[] nums1 , int[] nums2){
        int i = nums1.length - nums2.length -1; //6  - 3 = 3 - 1 = 2 valid //first
        int j = nums2.length - 1;  //second   // j  = 2
        int k = nums1.length - 1;  //last  // k = 5

        while(i >= 0 && j >= 0) {
            if(nums2[j] > nums1[i]){
                nums1[k--] =  nums2[j--];
                
                
            }
            else{
                nums1[k--] =  nums1[i--];
            }
        }

        while(j>=0){
            nums1[k--] =  nums2[j--];
        }

        return nums1;
       
        


    }

}

/**
 *
 * Input : nums1 = [-5, -2, 4, 5, 0, 0, 0], nums2 = [-3, 1, 8]
 * Output : [-5, -3, -2, 1, 4, 5, 8]
 * Explanation : The merged array is: [-5, -3, -2, 1, 4, 5, 8], where [-5, -2,
 * 4, 5] are from nums1 and [-3, 1, 8] are from nums2
 * 
 * Input : nums1 = [0, 2, 7, 8, 0, 0, 0], nums2 = [-7, -3, -1]
 * Output : [-7, -3, -1, 0, 2, 7, 8]
 * Explanation : The merged array is: [-7, -3, -1, 0, 2, 7, 8], where [0, 2, 7,
 * 8] are from nums1 and [-7, -3, -1] are from nums2
 */