public class StringToLetters {

    public String stringToLetters(String str1) {

        String str2 = "";

        if (str1.length() > 0 && str1 != null) {

            int count = 0;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) > 64 && str1.charAt(i) < 91 || str1.charAt(i) > 96 && str1.charAt(i) < 123
                        || str1.charAt(i) > 1039 && str1.charAt(i) < 1104 || str1.charAt(i) == 1025
                        || str1.charAt(i) == 1105) {
                    count++;
                }
            }

            String[] arr1 = new String[count];
            count = 0;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) > 64 && str1.charAt(i) < 91 || str1.charAt(i) > 96 && str1.charAt(i) < 123
                        || str1.charAt(i) > 1039 && str1.charAt(i) < 1104 || str1.charAt(i) == 1025
                        || str1.charAt(i) == 1105) {

                    arr1[count] = String.valueOf(str1.charAt(i));
                    count++;
                }
            }

            for (int i = 0; i < arr1.length; i++) {
                str2 += arr1[i];
            }

            return str2;
        }

        return str2;
    }
}
