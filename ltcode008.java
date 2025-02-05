public class Ltcode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        Ltcode008 Ltcode008 = new Ltcode008();
   
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Ltcode008.merge(nums1, m, nums2, n);
        System.out.println(java.util.Arrays.toString(nums1)); 

        int[] nums1_2 = {1};
        int m_2 = 1;
        int[] nums2_2 = {};
        int n_2 = 0;
        Ltcode008.merge(nums1_2, m_2, nums2_2, n_2);
        System.out.println(java.util.Arrays.toString(nums1_2)); 

        int[] nums1_3 = {0};
        int m_3 = 0;
        int[] nums2_3 = {1};
        int n_3 = 1;
        Ltcode008.merge(nums1_3, m_3, nums2_3, n_3);
        System.out.println(java.util.Arrays.toString(nums1_3)); 
    }
}