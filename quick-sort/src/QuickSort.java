import java.util.Arrays;

public class QuickSort {  // Sınıf adı QuickSort olarak değiştirildi
    int[] arr = {2, 17, -4, 42, 9, 26, 11, 3, 5, 28};

    void qSortInt(int a[], int min, int max) {
        int altIndis;
        altIndis = min;
        int üstIndis = max;
        int mid;

        if (max > min) {
            mid = a[(min + max) / 2];

            while (altIndis <= üstIndis) {
                while (a[altIndis] < mid)
                    ++altIndis;

                while (a[üstIndis] > mid)
                    --üstIndis;

                if (altIndis <= üstIndis) {
                    int t = a[üstIndis];
                    a[üstIndis] = a[altIndis];
                    a[altIndis] = t;
                    ++altIndis;
                    --üstIndis;
                }
            }

            if (min < üstIndis)
                qSortInt(a, min, üstIndis);

            if (altIndis < max)
                qSortInt(a, altIndis, max);
        }
    }

    public static void main(String[] args) {
        QuickSort intSort = new QuickSort();  // Nesne adı QuickSort sınıfı ile uyumlu
        System.out.println("Sıralamadan önce: ");
        System.out.println(Arrays.toString(intSort.arr));
        intSort.qSortInt(intSort.arr, 0, intSort.arr.length - 1);
        System.out.println("Sıralamadan sonra:");
        System.out.println(Arrays.toString(intSort.arr));
    }
}
