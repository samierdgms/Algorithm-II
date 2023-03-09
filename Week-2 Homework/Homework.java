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
        long start = System.currentTimeMillis();
        selectionsort(a);
        long elapsedTimeMillis = System.currentTimeMillis()-start;
        print(a);
        System.out.println();
         System.out.println("Selection Sort Süresi "+elapsedTimeMillis);
        long start1 = System.currentTimeMillis();
        bubblesort(b);
        long elapsedTimeMillis1 = System.currentTimeMillis()-start1;
        System.out.println("Bubble Sort ile Sıralanmış Dizi");
        print(b);
        System.out.println();
        System.out.println("Bubble Sort Süresi "+elapsedTimeMillis1);
        long start2 = System.currentTimeMillis();
        combsort(c);
        long elapsedTimeMillis2 = System.currentTimeMillis()-start2;
        System.out.println("Comb Sort ile Sıralanmış Dizi");
        print(c);
        System.out.println();
         System.out.println("Comb Sort Süresi "+elapsedTimeMillis2);
        long start3 = System.currentTimeMillis();
        insertionsort(d);
        long elapsedTimeMillis3 = System.currentTimeMillis()-start3;
        System.out.println("Insertion Sort ile Sıralanmış Dizi");
        print(d);
        System.out.println();
        System.out.println("Insertion Sort Süresi "+elapsedTimeMillis3);


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
