public class OddEven {

    public String oddEven(long a) {

        if (a > Integer.MIN_VALUE && a < Integer.MAX_VALUE) {
            if (a % 2 != 0) {

                return "Odd";
            } else if (a % 2 == 0) {

                return "Even";
            }
        }

        return "Undefined";
    }
}
