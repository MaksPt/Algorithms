public class StartsWithLetter {

    public String startsWithLetter(String str1) {
        String str2 = "";

        if (str1.length() > 0 && str1 != null) {

            str1 = str1.replace(",", "");
            str1 = str1.replace(".", "");
            str1 = str1.replace("\n", " ");
            str1 = str1.replace("(", "");
            str1 = str1.replace(")", "");

            String[] arr1 = str1.split(" ");
            int count = 0;

            for (int i = 0; i < arr1.length; i++) {
                if (Character.toString(arr1[i].charAt(0)).equals("l") ||
                        Character.toString(arr1[i].charAt(0)).equals("L")) {
                    count++;
                }
            }
            if (count > 0) {
                String[] result = new String[count];
                count = 0;

                for (int i = 0; i < arr1.length; i++) {
                    if (Character.toString(arr1[i].charAt(0)).equals("l") ||
                            Character.toString(arr1[i].charAt(0)).equals("L")) {
                        result[count] = arr1[i];
                        count++;
                    }
                }
                for (int i = 0; i < result.length - 1; i++) {
                    str2 += result[i] + ", ";
                }

                return str2 + result[result.length - 1];
            }

            return str2;
        }

        return str2;
    }
}



