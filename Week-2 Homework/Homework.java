import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int[1000];

        for (int i = 0; i <a.length ; i++) {
            a[i]= random.nextInt(999)+1;
        }
        System.out.println("Sıralanmamış Dizi");
        print(a);
        int[]b = a;
        int[]c = a;
        int[]d = a;

        System.out.println();
        System.out.println("Selection Sort ile Sıralanmış Dizi");
        long basla1 = System.currentTimeMillis();
        selectionsort(a);
        long bitir1 = System.currentTimeMillis();
        print(a);
        System.out.println();
        System.out.println("Selection Sort Süresi "+(basla1-bitir1));
        long basla2 =System.currentTimeMillis();
        bubblesort(b);
        long bitir2 = System.currentTimeMillis();
        System.out.println("Bubble Sort ile Sıralanmış Dizi");
        print(b);
        System.out.println();
        System.out.println("Bubble Sort Süresi "+(basla2-bitir2));
        long basla3 = System.currentTimeMillis();
        combsort(c);
        long bitir3 = System.currentTimeMillis();
        System.out.println("Comb Sort ile Sıralanmış Dizi");
        print(c);
        System.out.println();
        System.out.println("Comb Sort Süresi "+(basla3-bitir3));
        long basla4 = System.currentTimeMillis();
        insertionsort(d);
        long bitir4 = System.currentTimeMillis();
        System.out.println("Insertion Sort ile Sıralanmış Dizi");
        print(d);
        System.out.println();
        System.out.println("Insertion Sort Süresi "+(basla4-bitir4));


    }
    public static int[] selectionsort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;

                }

            }
        }
        return a;

    }

    public static int[] bubblesort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;

                }

            }

        }
        return a;
    }
    public static int[] combsort(int[] a) {
        int c = (a.length / (a.length - 2 / 5) + 1);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + c; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int x = a[j];
                    a[j] = a[i];
                    a[i] = x;
                }
            }
            if (c > 1) {
                c = (a.length / (a.length - 2 / 5));
            }
            if (c < 1) {
                c = 1;
            }


        }
        return a;
    }
    public static int[] insertionsort(int[] a) {


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <i; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;

                }

            }
        }
        return a;
    }


    public static void print(int[] a) {


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }

}
