import java.util.Scanner;

public class OgrListe {
    OgrNode head = null;
    String name;
    String surName;
    int number;
    int midterm;
    int fin;
    double gpa;
    String result;

    Scanner ces = new Scanner(System.in);

    void ekle() {
        System.out.println("Yazılım Mühendisliği Bölümüne Kayıt Olacak Öğrenci Bilgilerini Giriniz : ");
        System.out.println("Öğrenci No :");
        number = ces.nextInt();
        ces.nextLine();
        System.out.println("Öğrenci Ad :");
        name = ces.nextLine();
        System.out.println("Öğrenci Soyad :");
        surName = ces.nextLine();
        System.out.println("Midterm :");
        midterm = ces.nextInt();
        System.out.println("Final :");
        fin = ces.nextInt();

        OgrNode ogrenci = new OgrNode(name, surName, number, midterm, fin);

        if (head == null) {
            head = ogrenci;
            System.out.println("Liste Ypısı Oluşturuldu, ilk öğrenci bölüme kayıt edildi.");
        } else {
            OgrNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ogrenci;
            System.out.println(number + " numaralı öğrenci bölüme  kayıt edildi.");
        }


    }


    void sil() {
        System.out.print("Silmek istediğiniz öğrenci numarası :");
        int silinecek = ces.nextInt();

        if (head == null) {
            System.out.println("Liste boş, silinecek öğrenci kaydı yok !");
            return;
        }
        if (head.number == silinecek) {
            head = head.next;
            System.out.println(silinecek + "numaralı öğrenci kaydı silindi, listede kayıtlıı öğrenci kalmadı.");
            return;
        } else {
            OgrNode temp = head;
            while (temp.next != null) {
                if (temp.next.number == silinecek) {
                    temp.next = temp.next.next;
                    System.out.print(silinecek + "numaralı öğrenci kaydı silindi...  ");
                    return;
                }
                temp = temp.next;

            }
            System.out.println(silinecek + " numaralı öğrenci bulunamadı.");


        }


    }

    void yazdir() {
        OgrNode temp = head;
        if (head == null) {
            System.out.print("Liste boş...");
            System.out.println();
        } else {
            while (temp != null) {
                System.out.println(temp.number + "numaralı öğrencinin bilgileri :");

                System.out.println("Ad     : " + temp.name);
                System.out.println("Soyad  : " + temp.surName);
                System.out.println("Numara : " + temp.number);
                System.out.println("Midterm: " + temp.midterm);
                System.out.println("Final  : " + temp.fin);
                System.out.println("Gpa    : " + temp.gpa);
                System.out.println("Sonucu : " + temp.result);

                temp = temp.next;

            }
        }


    }

    void enBasariliOgrenci() {
        if (head == null) {
            System.out.print("Liste boş...");
        } else {
            OgrNode temp = head;
            OgrNode enBasariliOgr = head;
            while (temp != null) {
                if (temp.gpa > enBasariliOgr.gpa) {
                    enBasariliOgr = temp;
                }
                temp = temp.next;
            }

            System.out.println("En başarılı öğrenci:");
            System.out.println("Numara: " + enBasariliOgr.number);
            System.out.println("Ad: " + enBasariliOgr.name);
            System.out.println("Soyad: " + enBasariliOgr.surName);
            System.out.println("Midterm: " + enBasariliOgr.midterm);
            System.out.println("Final: " + enBasariliOgr.fin);
            System.out.println("Gpa: " + enBasariliOgr.gpa);
            System.out.println("Sonucu: " + enBasariliOgr.result);

        }

    }

}

