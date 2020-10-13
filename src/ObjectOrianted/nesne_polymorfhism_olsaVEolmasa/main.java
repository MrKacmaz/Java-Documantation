package ObjectOrianted.nesne_polymorfhism_olsaVEolmasa;

public class main {
    public static void main(String[] args) {

        GeoSekiller geo1 = new GeoSekiller();
        kare k1 = new kare(-6);
        daire d1 = new daire(5);
        dikdörtgen dk1 = new dikdörtgen(2, 9);
        polyVaryazdır(geo1);
        polyVaryazdır(k1);
        polyVaryazdır(d1);
        polyVaryazdır(dk1);


        polyYokYazdır(geo1);
        polyYokYazdır(k1);
        polyYokYazdır(d1);
        polyYokYazdır(dk1);

    }

    public static void polyVaryazdır(GeoSekiller şekil) {

        //kare sınıfındaki k1 geo şekilmiş gibi davranarak bu methotta geoşekil nesnesi özelliğini gösterir
        //daie sınıfındaki d1 geo şekilmiş gibi davranarak bu methotta geoşekil nesnesi özelliğini gösterir
        //dikdörtgen sınıfındaki dk1 geo şekilmiş gibi davranarak bu methotta geoşekil nesnesi özelliğini gösterir
        System.out.println("alanlar: " + şekil.alanHesapla());
        System.out.println("çevreler: " + şekil.çevreHesapla() + "\n");
    }



    //her ObjectOrianted.nesne object sınıfının bir nesnesidir
    //object > geoşekiller > kare,daire vs

    public static void polyYokYazdır(Object obj) {

        if (obj instanceof GeoSekiller) {
            GeoSekiller g = (GeoSekiller) obj;
            System.out.println("alan: " + g.alanHesapla());
            System.out.println("çevre: " + g.çevreHesapla());
        }
        //obj bir object classının nesnesidir yani büyüktür. onu daha küçük bir nesneye çevirirken
        //yani kare daire yapmak isterken instanceOf yani örneği mi bir alt sınıfın anahtar kelimesi kullanılır
        else if (obj instanceof kare) {

            //alt nesneye çevirirken ne olduğunu belli ederek çevirmen lazım: ÖRNEKLER
            //int a = 5; double b = 50
            //a = (int) b
            //int c = (int)(Math.Random());
            kare k = (kare) obj;

            System.out.println("alan: " + k.alanHesapla());
            System.out.println("çevre: " + k.çevreHesapla());

        }
        else if (obj instanceof daire) {
            daire d = (daire) obj;
            System.out.println("alan: " + d.alanHesapla());
            System.out.println("çevre: " + d.çevreHesapla());
        }
        else if (obj instanceof dikdörtgen) {

            dikdörtgen dk = (dikdörtgen) obj;
            System.out.println("alan: " + dk.alanHesapla());
            System.out.println("çevre: " + dk.çevreHesapla());
        } else System.err.println("Wrong object");

    }


}
