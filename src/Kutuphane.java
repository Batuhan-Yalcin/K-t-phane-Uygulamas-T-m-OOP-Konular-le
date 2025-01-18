import java.util.ArrayList;

public class Kutuphane {
    private ArrayList<Kitap> kitaplar;
    private ArrayList<Uye> uyeler;

    public Kutuphane() {
        kitaplar = new ArrayList<>();
        uyeler = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
        System.out.println(kitap.getAd() + " kütüphaneye eklendi.");
    }

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
        System.out.println(uye.getIsim() + " kütüphaneye üye olarak eklendi.");
    }

    public void kitaplariListele() {
        for (Kitap kitap : kitaplar) {
            kitap.detaylariYazdir();
        }
    }

    public void uyeleriListele() {
        for (Uye uye : uyeler) {
            System.out.println("Üye: " + uye.getIsim() + ", ID: " + uye.getId());
        }
    }
}
