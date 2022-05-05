public class Intersection {

    public int[] Intersection(int[] array1, int[] array2) {
        int count = 0;
        int[] emptyArray = {};

        if (array1.length > 0 && array2.length > 0) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        count++;
                    }
                }
            }
            int[] intersection = new int[count];
            count = 0;

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        intersection[count] = array1[i];
                        count++;
                    }
                }
            }
            for (int i = 0; i < intersection.length; i++) {
                for (int j = i + 1; j < intersection.length; j++) {
                    if (intersection[i] == intersection[j]) {
                        intersection[i] = Integer.MIN_VALUE;
                    }
                }
            }

            count = 0;

            for (int i = 0; i < intersection.length; i++) {
                if (intersection[i] != Integer.MIN_VALUE) {
                    count++;
                }
            }
            int[] result = new int[count];
            count = 0;

            for (int i = 0; i < intersection.length; i++) {
                if (intersection[i] != Integer.MIN_VALUE) {
                    result[count] = intersection[i];
                    count++;
                }
            }

            return result;
        } else {

            return emptyArray;
        }
    }
}
