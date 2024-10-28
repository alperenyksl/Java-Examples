//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ogrencisayi = 10; // 4 byte veri tutar
        byte sayi=12;//-128 127 arası // 1 byte veri tutar
        short sayi2=15;// 2 byte veri tutar
        double sayi3=25.5;
        float sayi4=22.5f;
        char harf='A';//"A" gibi cift tirnak olursa string algilar
        boolean gectimi=true;
        String mesaj="Ogrenci Sayisi:";
        System.out.println(mesaj + ogrencisayi);
        System.out.println(mesaj + sayi);
        System.out.println(mesaj + sayi2);
        System.out.println(mesaj + sayi3);
        System.out.println(mesaj + sayi4);
        System.out.println("Ogrenci notu =" + harf);
        System.out.println("Ogrenci" + gectimi);
    }
}