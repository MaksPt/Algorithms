public class StringToNumbers {

    public int[] StringToNumbers(String str1) {

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) > 47 && str1.charAt(i) < 58) {
                count++;
            }
        }

        int[] result = new int[count];
        count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) > 47 && str1.charAt(i) < 58) {
                result[count] = Integer.parseInt(String.valueOf(str1.charAt(i)));
                count++;
            }
        }

        return result;
    }
}
