//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String yenimesaj=mesaj.substring(0,5);
        System.out.println(yenimesaj);
        int sayi=topla(5,7);
        System.out.println(sayi);
        int toplam= topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Guncellendi");
    }
    public static int topla(int sayi1,int sayi2){// bu fonksiyon int deger döndürür.

        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for(int i=0;i<sayilar.length;i++){
            toplam+=sayilar[i];
        }
        return toplam;
    }
    public static String sehirver(){
        return "Ankara";
    }
}