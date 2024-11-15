//Selection sort algoritması ile sıralanmamış bir listede her iterasyonda en küçük eleman bulunur. İterasyon sonunda belirlenen
// en küçük eleman listenin başında bulunan eleman ile yer değiştirir. Bir sonraki iterasyona dahil edilmez.
// İkinci iterasyonda yine array elemanlarından en küçük olanı bulunur ve bu sefer listedeki
// 2.eleman ile yer değiştirir ve bu şekilde liste sıralanana kadar devam eder.
public class Main {

        public static void selectionSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // En küçük elemanı bulma
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                // En küçük elemanı, ilk sıradaki ile yer değiştirme
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] data = { 9, 5, 1, 4, 3 };
            System.out.println("Unsorted Array:");
            printArray(data);

            selectionSort(data);

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

