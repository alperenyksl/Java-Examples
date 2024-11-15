public class Main {

    // Function to perform the shell sort
    void shellSort(int arr[]) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gap insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift elements of arr[0..i-gap] that are greater than temp
                // to one position ahead of their current position
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Place temp (the element to be inserted) at its correct position
                arr[j] = temp;
            }
        }
    }

    // Driver code to test the shell sort algorithm
    public static void main(String[] args) {
        Main sorter = new Main();  // Main sınıfından bir nesne oluşturuluyor

        int[] arr = { 23, 12, 1, 5, 16, 3, 9, 8 };
        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sorter.shellSort(arr);  // shellSort fonksiyonunu çağırıyoruz

        System.out.println("\nArray after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
