//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi= 12;
        if(sayi<20){
            System.out.println("Sayi 20 den kucuk.");
        }
        else if(sayi==20){
            System.out.println("Sayi 20'ye esit.");
        }
        else {
            System.out.println("Sayi 20 den kucuk degil.");
        }
        switch (sayi){
            case 12:
                System.out.println("Sayi 12 ");
                break;
            case 20:
                System.out.println("Sayi 20 ");
                break;
            default:
                System.out.println("Sayi 20'de 12'de degil .");
        }
    }
}