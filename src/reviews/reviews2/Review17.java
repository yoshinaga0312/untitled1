package reviews.reviews2;

public class Review17 {
    public static void main(String[] args) {
        int num = 4;//[整数];
        int sum = 0;
        int i = 0;
        for (i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("結果" + sum);
    }
}
