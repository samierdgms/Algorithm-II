import java.util.Scanner;

public class Homework {
    static int sonuc = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen test etmek istediğiniz sayıyı giriniz");
        int a = input.nextInt();
        int b = test(a,1);
        if(a==b){
            System.out.println("Girdiğiniz sayı mükemmel sayıdır");

        }
        else {
            System.out.println("Girdiğiniz sayı mükemmel sayı değildir");

        }


    }
    public static int test(int a,int b){
   if(b<a){

        if(a%b==0){
             sonuc = b+test(a,b+1);
             return sonuc;
        }
        else{
            test(a,b+1);
            return sonuc;
        }

 }

    else {
        return -1;
    }


    }
 }
