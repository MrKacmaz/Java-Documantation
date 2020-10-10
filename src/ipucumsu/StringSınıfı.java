package ipucumsu;

public class StringSınıfı {
    public static void main(String[] args) {
        String takım = "FENERBAHÇE";
        String takım2 = "GALATASARAY";
        System.out.println("uzunluk: " + takım.length());
        System.out.println("7.indexinin harfi: " + takım.charAt(7));
        System.out.println("tekrar etme: " + takım.repeat(2));
        System.out.println("chars metodu: " + takım.chars());
        System.out.println("compare işlemi: " + takım.compareTo(takım2));
        System.out.println("endsWith işlemi: " + takım.endsWith(takım2));
        System.out.println("büyük harf: " + takım.toUpperCase());
        System.out.println("küçük harf: " + takım2.toLowerCase());
        System.out.println("substring baştan \nharf yok etme(5): " + takım2.substring(5));
        System.out.println("substring \naralık alma(1,7): " + takım2.substring(1, 7));
        System.out.println("replace harf değiştirme  E A: \n" + takım.replace('E', 'A'));
    }
}
