package FrazArrayEasy;
import java.util.*;
public class Merge {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int merged_length=m+n;
            int[] merged_array=new int[merged_length];
            int pos=0;
            for(int i=0;i<m;i++){
                merged_array[pos]=nums1[i];
                pos++;
            }
            for(int i=0;i<n;i++){
                merged_array[pos]=nums2[i];
                pos++;
            }
            Arrays.sort(merged_array);
            for(int i=0;i<m+n;i++){
                nums1[i]=merged_array[i];
            }

        }
    }
}
