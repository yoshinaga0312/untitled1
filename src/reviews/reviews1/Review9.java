package reviews.reviews1;
import java.io.*;
public class Review9 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr
                = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("名前を入力してください>");
        String inputName = br.readLine();
        System.out.print("年齢を入力してください>");
        String age = br.readLine();

        System.out.print(age + "歳の" + inputName + "さん。\nこんにちは。");
    }
}
