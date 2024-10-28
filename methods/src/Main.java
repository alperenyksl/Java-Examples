public class Main {
    public static void main(String[] args) {
        sayiBulmaca();// parametresiz

    }

public static void sayiBulmaca()
{
    int[] sayilar=new int[]{1,2,3,4,5,7,9,0};
    int aranacak= 6;
    boolean varmi=false;
    for (int sayi:sayilar){
        if(sayi==aranacak){
            varmi=true;
            break;
        }
    }
    if(varmi){
        System.out.println("Sayi mevcuttur.");
    }
    else{
        System.out.println("Sayi mevcut değildir.");
    }
}
}