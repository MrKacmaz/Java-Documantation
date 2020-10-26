package Game.FootbalSim;

import java.util.ArrayList;

public class Takım {
    private String FutbolTakımı;
    private double toplamGuc;
    int oynadığıMaç = 0;
    int kazandığıMaç = 0;
    int berabereMaç = 0;
    int kaybettiğiMaç = 0;
    private ArrayList<Futbolcu> futbolcuArrayList = new ArrayList<>();

    public Takım(String futbolTakımı) {
        FutbolTakımı = futbolTakımı;
    }


    public String getFutbolTakımı() {
        return FutbolTakımı;
    }

    public double getToplamGuc() {
        return toplamGuc;
    }

    public boolean oyuncuEkle(Futbolcu yeniKişi) {
        if (futbolcuArrayList.contains(yeniKişi)) {
            System.err.println(yeniKişi.getIsim() + " takımda var");
            return false;
        } else {
            System.out.println(yeniKişi.getIsim() + " takıma eklendi");
            futbolcuArrayList.add(yeniKişi);
            return true;
        }
    }
    public int toplamOyuncu(){
        return futbolcuArrayList.size();
    }
    public void macYap(Takım t1, int t1g, int t2g){
        if (t1g>t2g){
            kazandığıMaç++;
        }else if (t1g< t2g){
            kaybettiğiMaç++;
        }else {
            berabereMaç++;
        }oynadığıMaç++;
        if (t1 != null){
            t1.macYap(null,t2g,t1g);
        }
    }

    public int toplamPuan(){
        return ((kazandığıMaç*3) + berabereMaç);
    }


}
