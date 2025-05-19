public class Review18 {
    public static void main(String[] args) {
        int num = 5;//[整数];
        int sum = 0;
        int i = 0;
        for (i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("結果" + sum);
    }
}
