import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        OgrListe bilgisayarBolumu = new OgrListe();
        Scanner ces = new Scanner(System.in);

        int secim = -1;
        while (secim != 0) {
            System.out.println("---BİLGİSAYAR BÖÜLÜMÜ ÖĞRENCİ KAYIT UYGULAMASI---");
            System.out.println("1) Yeni kayıt");
            System.out.println("2) Kayıt sil");
            System.out.println("3) Kayıtları listele");
            System.out.println("4) En başarılı öğrenci bilgileri");
            System.out.println("0) ÇIKIŞ");

            System.out.println("Seçiminiz :");
            secim = ces.nextInt();


            if (secim == 1) {
                bilgisayarBolumu.ekle();
            } else if (secim == 2) {
                bilgisayarBolumu.sil();
            } else if (secim == 3) {
                bilgisayarBolumu.yazdir();
            } else if (secim == 4) {
                bilgisayarBolumu.enBasariliOgrenci();
            } else if (secim == 0) {
                System.out.println("Çıkış yapılıyor...");
            } else {
                System.out.println("Hatalı seçim yaptınız ([0-4])");
            }


        }


    }
}