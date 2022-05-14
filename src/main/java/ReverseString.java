public class ReverseString {

    public String reverseString(String str1) {
        String result = "";

        if (str1.length() > 0 && str1 != null) {

            int count = str1.length() - 1;
            String[] arr = new String[str1.length()];


            for (int i = 0; i < str1.length(); i++) {
                arr[count] = Character.toString(str1.charAt(i));
                count--;
            }

            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }

            return result;
        }

        return result;
    }
}
