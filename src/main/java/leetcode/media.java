package leetcode;

/**
 * Created by helmeter on 6/12/16.
 */
public class media {
    public double findMedianSortedArrays(int A[], int B[]) {
        int Alen = A.length;
        int Blen = B.length;
        int mid = (Alen + Blen) / 2;
        // odd and even
        if ((Alen + Blen) % 2 == 0) {
            return (findKth(A, B, mid - 1, 0, Alen - 1, 0, Blen - 1) + findKth(A, B, mid, 0, Alen - 1, 0, Blen - 1)) / 2;
        } else {
            return findKth(A, B, mid, 0, Alen - 1, 0, Blen - 1);
        }
    }
    public static double findKth(int[] a, int[] b, int k, int astart, int aend, int bstart, int bend) {
        int alength = aend - astart + 1;
        int blength = bend - astart + 1;
        // special case
        if (alength == 0)
            return b[bstart + k];
        if (blength == 0)
            return a[astart + k];
        if (k == 0)
            return a[astart] < b[bstart] ? a[astart] : b[bstart];
        // the number before mid
        int amid = alength * k / (alength + blength);
        int bmid = k - amid-1;
        // the mid index
        amid = amid + astart;
        bmid = bmid + bstart;
        if (a[amid] > b[bmid]) {
            k = k - (bmid - bstart + 1);
            aend = amid;
            bstart = bmid + 1;
        } else {
            k = k - (amid - astart + 1);
            bend = bmid;
            astart = amid + 1;
        }
        return findKth(a, b, k, astart, aend, bstart, bend);
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        int b[] = {3,5,6,7,8,9};
        new media().findMedianSortedArrays(a,b);
    }
}