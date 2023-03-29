import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int a = input.nextInt();
        int b = hesap(a);
        System.out.println(b);


    }
        public static int hesap(int b) {
            if (b == 0){
                return 1;
            }
            else if (b<10){
                return 0;
            }
            else {
                int sonhane = b%10;
                int guncelsayi = (int)b/10;
                if(sonhane == 0){
                    return 1+hesap(guncelsayi);

                }
                else {
                    return 0+hesap(guncelsayi);
                }

            }

        }


    }
