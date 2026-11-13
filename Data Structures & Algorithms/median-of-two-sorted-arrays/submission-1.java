class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = 0, r = 0;
        int m = nums1.length, n = nums2.length;
        int combined[] = new int[m+n];
        int i = 0;
        while(l<m && r<n)
        {
            if(nums1[l]<=nums2[r])
            {
                combined[i] = nums1[l];
                i++;
                l++;
            }
            else
            {
                combined[i] = nums2[r];
                i++;
                r++;
            }
        }
        while(l<m)
        {
            combined[i] = nums1[l];
            i++;
            l++;
        }
        while(r<n)
        {
            combined[i] = nums2[r];
            i++;
            r++;
        }
        int mid = (m+n)/2;
        if((m+n)%2==0)
        {
            return ((double)combined[mid] + combined[mid-1])/2;
        }
        else
        return (double)combined[mid];
    }
}
