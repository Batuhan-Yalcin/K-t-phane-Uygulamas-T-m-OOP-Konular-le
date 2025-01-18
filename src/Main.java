public class Main {
    public static void main(String[] args) {

    	
        Kutuphane kutuphane = new Kutuphane();


        Uye uye1 = new Uye("Batuhan", 1);
        Uye uye2 = new Uye("Şevval", 2);

   
        Kitap kitap1 = new TeknikKitap("Java Programlama", "MEHMET KİRAZLI", "Yazılım Geliştirme");
        Kitap kitap2 = new Roman("Tutunamayanlar Romanı", "Oğuz Atay", "Hayat");

       
        kutuphane.uyeEkle(uye1);
        kutuphane.uyeEkle(uye2);
        kutuphane.kitapEkle(kitap1);
        kutuphane.kitapEkle(kitap2);

  
        System.out.println("Kitaplar:");
        kutuphane.kitaplariListele();
        System.out.println("Üyeler:");
        kutuphane.uyeleriListele();

      
        try {
            KitapOduncAlma.oduncAl(kitap1); 
            KitapOduncAlma.oduncAl(kitap2); 

         
            kitap1.oduncVer();
            kitap2.oduncVer();
        } catch (KitapBulunamadiException e) {
            System.out.println(e.getMessage());
        }

      
        System.out.println("\nKitap Detayları:");
        kitap1.detaylariYazdir();
        kitap2.detaylariYazdir();
    }
}
