public class Example {
    public static void main(String[] args) {
        int[] b = {3, 1, 5, 4, 2, 6, 9, 0};
        System.out.println("Selection Sort Sıralama Öncesi");
        print(b);
        selectionsort(b);
        System.out.println();
        System.out.println("Selection Sort Sıralama Sonrası");
        print(b);
        System.out.println();
        int[] a = {12, 3, 6, 21, 7, 2, 15};
        System.out.println("Bubble Sort Sıralama Öncesi");
        print(a);
        bubblesort(a);
        System.out.println();
        System.out.println("Bubble Sort Sıralama Sonrası");
        print(a);
        System.out.println();
        int[] d = {2, 3, 32, 17, 7, 21, 8, 1, 4, 6, 12};
        System.out.println("Comb Sort Sıralama Öncesi");
        print(d);
        combsort(d);
        System.out.println();
        System.out.println("Comb Sort Sıralama Sonrası");
        print(d);
        System.out.println();
        int[] c = {14, 42, 32, 261, 7, 62, 1};
        System.out.println("Insertion Sort Sıralama Öncesi");
        print(c);
        insertionsort(c);
        System.out.println();
        System.out.println("Insertion Sort Sıralama Sonrası");
        print(c);


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
            for (int j = 0; j < i; j++) {
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