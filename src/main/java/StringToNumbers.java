public class StringToNumbers {

    public int[] stringToNumbers(String str1) {

        if (str1.length() > 0 && str1 != null) {
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

        return new int[0];
    }
}
