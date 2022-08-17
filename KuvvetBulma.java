import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {

        int sayi;

        Scanner input= new Scanner(System.in);
        System.out.print("Son Sayiyi giriniz: ");
        sayi=input.nextInt();

        for (int i=0; i<=sayi; i++){
            if (i%4==0 && i%5==0)
                System.out.println(i);
        }
    }
}
/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */