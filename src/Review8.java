public class Review8 {
    public static void main(String[] args) {
            int a = 10;
            double b = a;
            a = (int) b;
            a = Math.toIntExact(10000L);
            b = 10000L;
            b = (int)a;
            double f = 5.94F;
            short s = 10;
    }
}
