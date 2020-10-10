package LittleProject.Rehber;

// TODO: 4.10.2020  
public class kişiler {

    private String isim;
    private String soyisim;
    private String numarası;

    public kişiler(String isim, String soyisim, String  numarası) {
        setIsim(isim);
        setSoyisim(soyisim);
        setNumarası(numarası);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if (!isim.equals("")) {
            this.isim = isim;
        } else {
            this.isim = "--";
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        if (!soyisim.equals(null)) {
            this.soyisim = soyisim;
        } else {
            this.soyisim = "--";
        }
    }

    public String  getNumarası() {
        return numarası;
    }

    public void setNumarası(String  numarası) {
        if (numarası.equals("")) {
            this.numarası = "0";
        } else {
            this.numarası = numarası;
        }
    }

    public static kişiler kişiOluştur(String yeniİsİM, String yeniSOYİSİM, String yeniNumara){
        kişiler yeniKişi = new kişiler(yeniİsİM,yeniSOYİSİM,yeniNumara);
        return yeniKişi;
    }

    @Override
    public String toString() {
        return "\nismi: " + isim + "\nsoyismi: " + soyisim + "\nnumarası: " + numarası + "\n";
    }
}
