package java_text_book.chapter3;

public class chapter3_4 {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        }else{      //｛}　← これがない
            System.out.println("映画を見ます");
            System.out.println("寝ます");
        }
    }
}
