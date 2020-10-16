package ipucumsu;
// TODO: 16.10.2020  

public class harfSayma_harfDegistirme {
    public static void main(String[] args) {

        String string = "Hello, I am coder at AU";
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            //charAt(index) ==> karakterin indexini gösterir
            char harf = string.charAt(i);
            if (harf == 'a' || harf == 'A'){
                counter++;
            }
        }
        System.out.println("a harfinden: " + counter + " tane var");

        int harfSayısı = 0;
        for (int i = 0; i < string.length(); i++) {
            char harf = string.charAt(i);
            //boşlukları ve noktalama işaretlerini çıkartıyoruz
            if (harf != ' ' && harf!= ','){
                harfSayısı++;
            }
        }
        System.out.println("stringin uzunluğu " + string.length());
        System.out.println("harf sayısı " + harfSayısı);

        //replace ile harf değişimi yapılıyor !!!

        string = string.replace('a','e');

        System.out.println(string);


    }
}
