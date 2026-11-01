class Solution {
    private void swap(int nums1[],int nums2[],int left,int right){
        int temp = nums1[left];
        nums1[left] = nums2[right];
        nums2[right] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m-1;
        int right = 0;
        while(left>=0 && right<n){
            if(nums1[left]>nums2[right]){
                swap(nums1,nums2,left,right);
                left--;
                right++;
            }else break;
        }

        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);

        for(int i=m;i<n+m;i++){
            nums1[i] = nums2[i-m];
        }
    }
}