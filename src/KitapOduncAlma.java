public class KitapOduncAlma {
    public static void oduncAl(Kitap kitap) throws KitapBulunamadiException {
        if (kitap == null) {
            throw new KitapBulunamadiException("Kitap bulunamadı!");
        }
        kitap.oduncAl();
    }
}
