package ObjectOrianted.nesne_kompozisyon;

public class Main {

    public static void main(String[] args) {
        //kalıtım yapmadan ObjectOrianted.nesne üreterek başka classı kullanma
        araba nissan = new araba();
        nissan.haraketZamanı();
        nissan.durmaZamanı();
    }

}
