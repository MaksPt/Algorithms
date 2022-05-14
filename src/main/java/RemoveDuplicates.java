public class RemoveDuplicates {

    public String removeDuplicates(String str1) {
        String str2 = "";

        if (str1.length() > 0 && str1 != null) {

            str1 = str1.toLowerCase();
            char[] arr = str1.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = 32;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                str2 += arr[i];
            }

            return str2.replace(" ", "");
        }

        return str2;
    }
}

