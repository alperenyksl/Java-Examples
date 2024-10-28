//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      String mesaj1="  Bugün hava çok güzel.  ";
      System.out.println(mesaj1);
      System.out.println(mesaj1.length());
      System.out.println("5. eleman="+mesaj1.charAt(4));
      System.out.println(mesaj1.concat(" Yaşasın!"));
      System.out.println(mesaj1.startsWith(("B")));// NBununla mı başlıyor
        System.out.println(mesaj1.endsWith((".")));// Bununla mı bitiyor
        char[] karakterler = new char[5];
        mesaj1.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj1.indexOf("a"));
        System.out.println(mesaj1.lastIndexOf("a"));
        String yeniMesaj = (mesaj1.replace(" ","+"));
        System.out.println(yeniMesaj);
        System.out.println(yeniMesaj.substring(0,5));
        for(String kelime : mesaj1.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj1.toLowerCase());
        System.out.println(mesaj1.toUpperCase());
        System.out.println(mesaj1.trim());
    }
}