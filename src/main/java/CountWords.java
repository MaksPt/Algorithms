public class CountWords {
    public int countWords(String str1, String str2) {

        if (str1 != null && str2 != null && str1.length() > 0 && str2.length() > 0) {

            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            String[] arr1 = str1.split(" ");
            int count = 0;

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equals(str2) || arr1[i].equals(str2 + ".") || arr1[i].equals(str2 + ",") ||
                        arr1[i].equals("(" + str2 + ")") || arr1[i].equals(str2 + ":") || arr1[i].equals(str2 + ";")) {
                    count++;
                }
            }

            return count;
        }

        return Integer.MIN_VALUE;
    }
}
