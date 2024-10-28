//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager();
    CustomerManager customerManager2 = new CustomerManager();
    CustomerManager.Add();
    CustomerManager.Remove();
    CustomerManager.Update();
    //value
    int sayi1=10;
    int sayi2=20;
    sayi2=sayi1;
    int sayi3=30;
    System.out.println(sayi2);
    int[] sayilar1= new int[]{sayi1,sayi3,sayi2};
    int[] sayilar2= new int[]{4,5,6};
    System.out.println(sayilar2[0]);
}

}