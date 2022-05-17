public class BiggerValue {
    Utils utils = new Utils();

    public int biggerValue(int a, int b) {

        if (utils.isIntDiapason(a) == true && utils.isIntDiapason(b) == true) {
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

