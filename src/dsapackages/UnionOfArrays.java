package dsapackages;

import java.util.Arrays;

public class UnionOfArrays {

    public static boolean isInArray(int[] arr, int value) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    /*
a {1, 1, 3, 7, 8, 3}
bb = {1, 1, 3, 17, 8, 3};
union =[]
union 1

     */
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 7, 8, 3};
        int[] b = {1, 1, 3, 17, 8, 3};
        int[] union = new int[a.length + b.length];
        int n = -1;
        int i = 0, j = -1, k = -1;
        while (i <= a.length - 1) {
            int avalue = a[i];
            if (!isInArray(union, avalue)) {
                union[k + 1] = avalue;
                System.out.println(Arrays.toString(union));
                k++;
            }
            i++;

        }
        i = 0;
        while (i <= b.length - 1) {
            int bvalue = b[i];
            if (!isInArray(union, bvalue)) {
                union[k + 1] = bvalue;
                System.out.println(Arrays.toString(union));
                k++;
            }
            i++;

        }
        while (i <= a.length - 1) {
            int avalue = a[i];
            if (!isInArray(union, avalue)) {
                union[k + 1] = avalue;
                System.out.println(Arrays.toString(union));
                k++;
            }
            i++;

        }
        for (i = 0; i <=k; i++) {
            System.out.printf("%d,", union[i]);
        }
        System.out.println();

    }
}
