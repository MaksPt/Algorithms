public class SumArray {
    Utils utils = new Utils();

    public int SumArray(int[] array) {

        if (utils.notEmptyArrays(array) == true) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            return sum;
        } else {

            return 0;
        }
    }
}
