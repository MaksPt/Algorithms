public class MinMaxAve {

    public int[] MinMaxAve(int[] array, int start, int end) {

        int[] result = new int[0];
        int[] MinMaxAve = new int[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        if (array.length > 0 && start <= end && start <= array.length && end <= array.length && start >= 0) {
            for (int i = start; i <= end; i++) {
                if (min > array[i]) {
                    min = array[i];
                    MinMaxAve[0] = min;
                }
                if (max < array[i]) {
                    max = array[i];
                    MinMaxAve[1] = max;
                }
                sum += array[i];
                MinMaxAve[2] = sum / ((end - start) + 1);
            }

        } else if (array.length > 0 && start > end && start <= array.length && end >= 0) {
            MinMaxAve = new int[3];
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            sum = 0;

            for (int i = end; i <= start; i++) {
                if (min > array[i]) {
                    min = array[i];
                    MinMaxAve[0] = min;
                }
                if (max < array[i]) {
                    max = array[i];
                    MinMaxAve[1] = max;
                }
                sum += array[i];
                MinMaxAve[2] = sum / ((start - end) + 1);
            }
        } else {

            return new int[0];
        }

        return MinMaxAve;
    }
}
