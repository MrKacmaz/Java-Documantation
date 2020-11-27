package linkedList.mp3;

public class şarkıBilgisi {
    private String adı;
    private int süre;

    public şarkıBilgisi(String adı, int süre) {
        this.adı = adı;
        this.süre = süre;
    }

    public şarkıBilgisi() {
    }

    public String getAdı() {
        return adı;
    }

    public void setAdı(String adı) {
        this.adı = adı;
    }

    public int getSüre() {
        return süre;
    }

    public void setSüre(int süre) {
        this.süre = süre;
    }

    @Override
    public String toString() {
        return "şarkıBilgisi{" +
                "adı='" + adı + '\'' +
                ", süre=" + süre +
                '}';
    }
}
