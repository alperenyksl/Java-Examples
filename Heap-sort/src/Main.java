//Üstteki bireylere parent (ata), alttaki bireylere child(çocuk) denir. Min heap algoritmasında ata birey en küçük sayıdır.
// Ata bireyden çocuklar türer ve ağaç şeklinde aşağıya doğru devam eder. Bireyler aşağıya doğru soldan sağa numaralandırılır.
//Heapify -> yığınlaştırma (stackleştirme)
public class Main {

    public static void heapSort(int[] array) {
        int n = array.length;

        // Diziyi max heap yapısına dönüştürme
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Elemanları heap'ten çıkarma ve sıralama
        for (int i = n - 1; i > 0; i--) {
            // Kökü son elemanla değiştir
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Kalan elemanları yeniden heap yapısına dönüştür
            heapify(array, i, 0);
        }
    }

    // Diziyi heap yapısına dönüştürme fonksiyonu
    public static void heapify(int[] array, int n, int i) {
        int largest = i; // Kök eleman
        int left = 2 * i + 1; // Sol çocuk
        int right = 2 * i + 2; // Sağ çocuk

        // Sol çocuğun kökten büyük olup olmadığını kontrol et
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Sağ çocuğun en büyüğünden büyük olup olmadığını kontrol et
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Eğer en büyük eleman kök değilse, değiştir ve alt ağacı heap yapısına dönüştür
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Alt ağaçları heap yapısına dönüştürme
            heapify(array, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Unsorted Array:");
        printArray(data);

        heapSort(data);

        System.out.println("\nSorted Array:");
        printArray(data);
    }

    // Diziyi yazdırmak için yardımcı fonksiyon
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
