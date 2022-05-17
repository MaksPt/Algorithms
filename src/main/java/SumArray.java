public class SumArray {
    Utils utils = new Utils();

    public int sumArray(int[] array) {

        if (utils.isNotEmptyArrays(array) == true) {
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
