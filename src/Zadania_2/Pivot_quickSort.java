package Zadania_2;

    public class Pivot_quickSort {

        public  int[] quickSort(int[] array) {
            return quickSort(array, 0, array.length - 1);
        }

        private <T extends Comparable> int[] quickSort(int[] array, int left, int right) {
            int i, j, pivot, temp;

            i = (left + right) / 2;
            pivot = array[i];
            array[i] = array[right];
            for (j = i = left; i < right; i++) {
                if (array[i] < pivot) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    j++;
                }
            }
            array[right] = array[j];
            array[j] = pivot;
            if (left < j - 1) quickSort(array, left, j - 1);
            if (j + 1 < right) quickSort(array, j + 1, right);
            return array;
        }





    }
