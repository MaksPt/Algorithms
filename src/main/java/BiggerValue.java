public class BiggerValue {
    Utils utils = new Utils();

    public int BiggerValue(int a, int b) {

        if (utils.intDiapason(a) == true && utils.intDiapason(b) == true) {
            if (a >= b) {

                return a;
            } else {

                return b;
            }
        } else {

            return Integer.MAX_VALUE;
        }
    }
}

