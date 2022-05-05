public class Utils {

    public boolean intDiapason(int a) {
        if (a < Integer.MAX_VALUE && a > Integer.MIN_VALUE) {

            return true;
        } else {

            return false;
        }
    }


    public boolean notEmptyArrays(int[] array) {
        if (array.length > 0) {

            return true;
        } else {

            return false;
        }
    }

    public int[] ArraySortMaxToMin(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }

    public int[] ArraySortMinToMax(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        return array;
    }


}
