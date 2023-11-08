public class Practice1 {
    public static void main(String[] args) {
        double val1 = 20.00d;
        double val2 = 80.00d;

        double val3 = (val1 + val2) * 100.00d;

        System.out.println(val3);

        double remainder = val3 % 40.00d;

        boolean isZero = remainder == 0;

        System.out.println(remainder);

        if (!isZero) {
            System.out.println("got some remainder");
        }
    }
}
