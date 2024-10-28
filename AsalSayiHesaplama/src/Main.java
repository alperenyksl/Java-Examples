
public class Main {
    public static void main(String[] args) {
        int number= 1;
        int remainder = number %2;
        //System.out.println(remainder);
        boolean isPrime = true; //isprime asal sayi mi demek

        if (number<2){
            System.out.println("Gecersiz sayi");
            return;
        }
        for(int i=2; i<number ; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number+" sayisi Asaldir.");
        }
        else{
            System.out.println(number+" sayisi Asal degildir");
        }

    }
}