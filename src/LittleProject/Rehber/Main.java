package LittleProject.Rehber;

// TODO: 4.10.2020

/**
 *
 *
 * @author Alperen KAÇMAZ
 *
 * @version V.1.0
 *
 *
 * */

import java.util.Scanner;

public class Main {

    public static cepTelefonu cepTelefonu = new cepTelefonu();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        çalıştır();


    }

    private static void çalıştır() {
        System.out.println("\n\t**********BAŞLATILIYOR**********\n");
        menu();
    }

    private static void menu() {
        System.out.print("\n*****Menu*****\n\n" +
                "1 -- Listele\n" +
                "2 -- Ekle\n" +
                "3 -- Sil\n" +
                "4 -- Güncelle\n" +
                "5 -- Kişi bul\n" +
                "6 -- Çıkış\n" +
                "Seçimin : ");
        int choose = input.nextInt();
        if (choose > 0 && choose < 7) {
            menuChooseOP(choose);
        } else {
            System.err.println("yanlış seçim\n");
            çalıştır();
        }

    }

    private static void menuChooseOP(int choose) {
        switch (choose) {

            //list all rehber
            case 1:
                cepTelefonu.Listeleme();
                menu();
                break;

            //add new person to rehber
            case 2:
                System.out.print("İsim= ");
                String newName = input.next();
                System.out.print("Soyisim = ");
                String newSurname = input.next();
                System.out.print("Numara = ");
                String newNumber = input.next();

                /*kişiler kişiler = new kişiler(newName,newSurname,newNumber);
                cepTelefonu.Ekleme(kişiler); kullanımı aynı alttakiyle */
                cepTelefonu.Ekleme(new kişiler(newName, newSurname, newNumber));
                menu();
                break;

            //delete person to rehber
            case 3:
                cepTelefonu.Listeleme();
                System.out.print("Kaçıncı kişiyi silmek istiyorsun: ");
                int chooseDelete = input.nextInt();
                System.out.println("\n" + chooseDelete + ". kişi siliniyor ..." +
                        "\nkişi silindi");
                cepTelefonu.Silme(cepTelefonu.rehber.get(chooseDelete - 1));
                menu();
                break;

            //update
            case 4:
                System.out.println("güncellenek kişinin adı: ");
                String arananİsim = input.next();
                int index = cepTelefonu.Sorgulama(arananİsim);
                if (index < 0) {
                    System.out.println("kişi bulunamadı");
                } else {
                    System.out.print("yeni isim: ");
                    String updateİsim = input.next();
                    System.out.print("yeni soyisim: ");
                    String updateSoyisim = input.next();
                    System.out.print("yeni numara: ");
                    String updateNumara = input.next();

                    cepTelefonu.rehber.get(index).setIsim(updateİsim);
                    cepTelefonu.rehber.get(index).setSoyisim(updateSoyisim);
                    cepTelefonu.rehber.get(index).setNumarası(updateNumara);
                    System.out.println((index + 1) + ". kişi güncellendi");
                }
                menu();
                break;

            //find a person
            case 5:
                System.out.println("1 - isimle mi  2 - sıraylar mı ");
                int chooseJr = input.nextInt();
                switch (chooseJr) {

                    case 1:
                        System.out.println("aranacak isim: ");
                        String findName = input.next();
                        int findNameIndex = cepTelefonu.Sorgulama(findName);
                        if (findNameIndex >= 0) {
                            System.out.println(cepTelefonu.rehber.get(findNameIndex).toString());
                            break;
                        } else {
                            System.err.println("böyle bir kişi bulunamadı");
                        }
                        break;

                    case 2:
                        System.out.println("kaçıncı kişi");
                        int chooseJr2 = input.nextInt();
                        System.out.println((cepTelefonu.rehber.get(chooseJr2 - 1).toString()));
                        break;
                    default:
                        System.out.println("adamakıllı seç");
                }
                menu();
                break;

            //exit
            case 6:
                System.out.println("\n\t**********KAPATILIYOR**********\n");
                break;

        }
    }
}
