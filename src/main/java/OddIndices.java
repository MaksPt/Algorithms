public class OddIndices {
    Utils utils = new Utils();

    public int[] oddIndices(int[] array) {

        if (utils.isNotEmptyArrays(array) == true) {

            int[] OddIndices = new int[array.length / 2];
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (count < OddIndices.length) {
                    if (i % 2 != 0) {
                        OddIndices[count] = array[i];
                        count++;
                    }
                }
            }

            return OddIndices;
        } else {

            return array;
        }
    }
}
