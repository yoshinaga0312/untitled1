package reviews.reviews1;

public class Review12 {
    public static void main(String[] args) {
        int age = 17;
        if (age <= 18) {
            System.out.println("未成年");
        } else if (age <= 64) {
            System.out.println("成人");
        }else{
            System.out.println("無効な年齢です。");
        }
    }
}
