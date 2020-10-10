package nesne_kompozisyon;

public class araba {


    //motor classından engine nesnesini üreterek motor sınıfına ait methodları kullanabiliriz !!!!!!
    motor engine = new motor();

    public void haraketZamanı(){
        engine.start();
        System.out.println("harakete geçiliyor...");
    }
    public void durmaZamanı(){
        System.out.println("yavaşlanıyor...");
        engine.stop();
    }


}
