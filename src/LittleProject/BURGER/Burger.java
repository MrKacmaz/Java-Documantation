package LittleProject.BURGER;
public class Burger {

    private String ismi;
    private String EkmekÇeşidi;
    private String Etçeşidi;
    private double fiyat;

    private double ilaveUurn1Fiyat;
    private double ilaveUurn2Fiyat;
    private double ilaveUurn3Fiyat;
    private double ilaveUurn4Fiyat;
    private String ilaveUrun1;
    private String ilaveUrun2;
    private String ilaveUrun3;
    private String ilaveUrun4;

    public void ilaveUrünEkle1(String ilaveUrun1, double ilaveUurn1Fiyat) {
        this.ilaveUrun1 = ilaveUrun1;
        this.ilaveUurn1Fiyat = ilaveUurn1Fiyat;
    }

    public void ilaveUrünEkle2(String ilaveUrun2, double ilaveUurn2Fiyat) {
        this.ilaveUrun2 = ilaveUrun2;
        this.ilaveUurn2Fiyat = ilaveUurn2Fiyat;
    }

    public void ilaveUrünEkle3(String ilaveUrun3, double ilaveUurn3Fiyat) {
        this.ilaveUrun3 = ilaveUrun3;
        this.ilaveUurn3Fiyat = ilaveUurn3Fiyat;
    }

    public void ilaveUrünEkle4(String ilaveUrun4, double ilaveUurn4Fiyat) {
        this.ilaveUrun4 = ilaveUrun4;
        this.ilaveUurn4Fiyat = ilaveUurn4Fiyat;
    }


    //CONSTRUCTOR
    public Burger(String ismi, String ekmekÇeşidi, String etçeşidi, double fiyat) {
        this.ismi = ismi;
        EkmekÇeşidi = ekmekÇeşidi;
        setEtçeşidi(etçeşidi);
        setFiyat(fiyat);
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getEkmekÇeşidi() {
        return EkmekÇeşidi;
    }

    public void setEkmekÇeşidi(String ekmekÇeşidi) {
        EkmekÇeşidi = ekmekÇeşidi;
    }

    public String getEtçeşidi() {
        return Etçeşidi;
    }

    public void setEtçeşidi(String etçeşidi) {
        if (etçeşidi.equals("bonfile") || etçeşidi.equals("vegan köfte")) {
            this.Etçeşidi = etçeşidi;
        } else
            this.Etçeşidi = "normal et";
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat > 0) {
            this.fiyat = fiyat;
        } else {
            this.fiyat = 0;
            System.err.print(" Wrong Money");
        }

    }

    public double hamburgerBilgileri() {

        double toplam = this.fiyat;
        System.out.println("ismi = " + this.ismi +
                "\nEkmak çeşidi = " + this.EkmekÇeşidi +
                "\nEt çeşidi =  " + this.Etçeşidi +
                "\nHamburger fiyatı = " + this.fiyat + "\n");

        if (ilaveUrun1 != null) {
            fiyat += this.ilaveUurn1Fiyat;
            System.out.println("ilave ürün 1 = " + ilaveUrun1 + " Fiyatı = " + this.ilaveUurn1Fiyat);
        }
        if (ilaveUrun2 != null) {

            fiyat += this.ilaveUurn2Fiyat;
            System.out.println("ilave ürün 2 = " + ilaveUrun2 + " Fiyatı = " + this.ilaveUurn2Fiyat);

        }
        if (ilaveUrun3 != null) {
            fiyat += this.ilaveUurn3Fiyat;
            System.out.println("ilave ürün 3 = " + ilaveUrun3 + " Fiyatı = " + this.ilaveUurn3Fiyat);

        }
        if (ilaveUrun4 != null) {
            fiyat += this.ilaveUurn4Fiyat;
            System.out.println("ilave ürün 4 = " + ilaveUrun4 + " Fiyatı = " + this.ilaveUurn4Fiyat);

        }
        System.out.println("TOPLAM = " + getFiyat() + "\n");

        return toplam;

    }
}
