public class KthLargest {
    Utils utils = new Utils();

    public int kthLargest(int[] array, int k) {

        if (array.length > 0 && k > 0 && k <= array.length) {
            utils.ArraySortMaxToMin(array);

            return k = array[k - 1];
        } else {

            return Integer.MIN_VALUE;
        }
    }
}