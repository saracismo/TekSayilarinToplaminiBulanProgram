import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int a;
            int total=0;

            do {
                Scanner inp = new Scanner(System.in);

            System.out.print("Sayı Giriniz: ");
            a = inp.nextInt();

            if(a%2 == 0 && a%4 == 0){
                total += a;
                System.out.println("Çift ve 4'ün katları olan sayıların toplamı: " + total);
            } else {
                System.out.println("Tek sayı girdiniz. ");
                break;


            }

            }

            while (a>0);

            System.out.println("Çift ve 4'ün katları olan sayıların toplamı:" + total + "\n");


        }
    }
