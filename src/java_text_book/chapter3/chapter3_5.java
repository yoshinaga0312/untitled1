package java_text_book.chapter3;
import java.io.*;
public class chapter3_5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr
                = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更 >");
        int selected = Integer.parseInt(br.readLine());
        switch (selected) {
            case 1 -> {
                System.out.println("検索します");
            }
            case 2 -> {
                System.out.println("登録します");
            }
            case 3 -> {
                System.out.println("削除します");
            }
            case 4 -> {
                System.out.println("変更します");
            }
        }
    }
}
