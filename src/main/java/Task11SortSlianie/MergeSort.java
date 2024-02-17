package Task11Coll3;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        int b = a.length;
        if (b < 2) {
            return a;
        }
        int sort = b / 2;
        int[] l = new int[sort];
        int[] r = new int[b - sort];

        for (int i = 0; i < sort; i++) {
            l[i] = a[i];
        }
        for (int i = sort; i < b; i++) {
            r[i - sort] = a[i];
        }
        l = mergeSort(l);
        r = mergeSort(r);

        return merge(l, r);


    }
    public static int[] merge(int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int[] a = new int[left + right];
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }

}
