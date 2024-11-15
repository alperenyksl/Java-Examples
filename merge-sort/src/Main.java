//Merge Sort algoritması parçala ve fethet (divide and conquer), birleştir prensibiyle çalışır. Dizi sürekli olarak
// parçalanır ve en sonunda her eleman bir dizi haline gelir. Ardından bu diziler sıralanarak birleştirilir.
public class Main {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Unsorted Array:");
        printArray(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("\nSorted Array:");
        printArray(data);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
