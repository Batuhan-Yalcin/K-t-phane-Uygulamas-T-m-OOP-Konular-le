public abstract class Kitap {
    private String ad;
    private String yazar;
    private boolean oduncAlindi;

    public Kitap(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
        this.oduncAlindi = false;
    }

    public abstract void detaylariYazdir();

    // Getter ve Setter metodları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public boolean isOduncAlindi() {
        return oduncAlindi;
    }

    public void setOduncAlindi(boolean oduncAlindi) {
        this.oduncAlindi = oduncAlindi;
    }

    public void oduncAl() {
        if (!oduncAlindi) {
            oduncAlindi = true;
            System.out.println(ad + " kitabı ödünç alındı.");
        } else {
            System.out.println(ad + " kitabı zaten ödünç alındı.");
        }
    }

    public void oduncVer() {
        if (oduncAlindi) {
            oduncAlindi = false;
            System.out.println(ad + " kitabı geri alındı.");
        } else {
            System.out.println(ad + " kitabı ödünç alınmamış.");
        }
    }
}
