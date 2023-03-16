import java.util.Random;

public class Homework {

    public static void main(String[] args) {
        Random random = new Random();
        int c = random.nextInt(1000);
        int [] a = new int[1000];


        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        int b[]=a;
        long basla = System.nanoTime();
        linearsearch(a,c);
        long bitir = System.nanoTime();
        System.out.println("Linear Seach Süresi "+(basla-bitir));
        long basla1 = System.nanoTime();
        binarysearch(b,c);
        long bitir1 = System.nanoTime();
        System.out.println("Binary Seach Süresi "+(basla1-bitir1));



    }
    public static int linearsearch(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }

        }

        return -1;
    }
    public static int binarysearch(int[] a, int b) {
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
