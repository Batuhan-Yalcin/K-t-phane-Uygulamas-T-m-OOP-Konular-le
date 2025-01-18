public class TeknikKitap extends Kitap {
    private String konu;

    public TeknikKitap(String ad, String yazar, String konu) {
        super(ad, yazar);
        this.konu = konu;
    }

    @Override
    public void detaylariYazdir() {
        System.out.println("Teknik Kitap: " + getAd() + ", Yazar: " + getYazar() + ", Konu: " + konu);
    }
}
