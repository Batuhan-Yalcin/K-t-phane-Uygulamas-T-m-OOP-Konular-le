public class Roman extends Kitap {
    private String tur;

    public Roman(String ad, String yazar, String tur) {
        super(ad, yazar);
        this.tur = tur;
    }

    @Override
    public void detaylariYazdir() {
        System.out.println("Roman: " + getAd() + ", Yazar: " + getYazar() + ", Tür: " + tur);
    }
}
