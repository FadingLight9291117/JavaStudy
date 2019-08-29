/**
 * 快速排序
 *
 * @author Fadin
 */
public class QuickSort {
    private int medium3(int[] a, int left, int right) {
        int center = (left + right) / 2;
        if (a[left] > a[center]) {
            int temp = a[left];
            a[left] = a[center];
            a[right] = temp;
        }
        if (a[center] > a[right]) {
            int temp = a[center];
            a[center] = a[right];
            a[right] = temp;
        }
        if (a[left] > a[center]) {
            int temp = a[left];
            a[left] = a[center];
            a[center] = temp;
        }
        int temp = a[center];
        a[center] = a[right - 1];
        a[right - 1] = temp;
        return right - 1;
    }

    private void insertionSort(int[] a, int left, int right) {
        int temp;
        for (int i = left + 1; i <= right; i++) {
            temp = a[i];
            int j;
            for (j = i; j > 0 && a[j - 1] > temp; --j) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }

    private void _sort(int[] a, int left, int right) {
        int cutOff = 8;
        if (right - left >= cutOff) {
            int pivot = medium3(a, left, right);
            int i = left;
            int j = right - 1;
            while (true) {
                while (a[++i] < a[pivot]) ;
                while (a[--j] > a[pivot]) ;
                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else {
                    break;
                }
            }
            int temp = a[i];
            a[i] = a[pivot];
            a[pivot] = temp;
            _sort(a, left, i - 1);
            _sort(a, i + 1, right);
        } else {
            insertionSort(a, left, right);
        }
    }

    public void sort(int[] a) {
        _sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 2, 1, 2, 3, 4, 6, 7, 43, 3, 12, 56, 9, 69};
        QuickSort sort = new QuickSort();
        double beginTime = System.nanoTime();
        sort.sort(a);
        double duringTime = System.nanoTime() - beginTime;
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(duringTime / 1000);
    }
}
