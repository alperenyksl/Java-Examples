public class Dortislem {
    public int Topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
    public int Cikar(int sayi1, int sayi2) {
        if(sayi1>sayi2)
            return sayi1-sayi2;
        else if (sayi2>sayi1)
            return sayi2-sayi1;
        else
            return 0;
    }
    public int Carp(int sayi1, int sayi2) {
        return sayi1*sayi2;
    }
    public int bol(int sayi1, int sayi2) {
        if(sayi1>sayi2)
            return sayi1/sayi2;
        else if(sayi2>sayi1)
            return sayi2/sayi1;
        else
            return 1;
    }
}
