public class SortArray {
    Utils utils = new Utils();

    public int[] sortArray(int[] array) {

        if (utils.notEmptyArrays(array) == true) {

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
        } else {

            return array;
        }
    }
}



