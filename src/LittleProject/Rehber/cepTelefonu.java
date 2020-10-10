package LittleProject.Rehber;
// TODO: 4.10.2020  
import java.util.ArrayList;

public class cepTelefonu {

    public ArrayList<kişiler> rehber;

    public cepTelefonu() {

        this.rehber = new ArrayList<>();

    }

    public void Silme(kişiler silinecekKişi) {
        rehber.remove(silinecekKişi);
    }

    public Boolean Ekleme(kişiler eklenicekKişi) {

        if (Sorgulama(eklenicekKişi.getIsim()) >= 0) {
            System.out.println("\nBu kişi zaten mevcut !!");
            return false;
        } else {
            rehber.add(eklenicekKişi);
            return true;
        }
    }

    public void Listeleme() {
        if (rehber.size() == 0) {
            System.out.println("\nListe Boş");
        } else {
            System.out.println("\nTüm Liste");
            for (int i = 0; i < rehber.size(); i++) {
                System.out.println((i + 1) + ". kişi " + rehber.get(i).toString());
            }
        }
    }

    public int Sorgulama(kişiler aranacakKişi) {
        return this.rehber.indexOf(aranacakKişi);
    }

    public int Sorgulama(String aranacakKişi) {
        for (int i = 0; i < rehber.size(); i++) {
            kişiler arananKişi = this.rehber.get(i);
            if (arananKişi.getIsim().equals(aranacakKişi)) {
                return i;
            }

        }
        return -1;
    }

}