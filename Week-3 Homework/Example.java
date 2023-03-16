public class Example {
    public static void main(String[] args) {
        int[] a = {1, 2, 6, 3, 4, 1, 7, 3};
        int x = 10;
        int y = 3;
        int lc=linearsearch(a, x);
        System.out.println("Linear Search Değeri "+lc);
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         int bc=binarysearch2(b, y);
        System.out.println("Binary Search Değeri "+bc);


    }


    public static int linearsearch(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }

        }

        return -1;
    }

    public static int binarysearch2(int[] a, int b) {
        int alt = 0;
        int ust = a.length - 1;
        int mid = alt + (ust - alt) / 2;
        while (alt <= ust) {
            mid = alt + (ust - alt) / 2;
            if (a[mid] == b) {
                return mid;
            } else if (a[mid] < b) {
                alt = mid + 1;
            } else if (a[mid] > b) {
                ust = mid - 1;
            }


        }
        return -1;


    }
}