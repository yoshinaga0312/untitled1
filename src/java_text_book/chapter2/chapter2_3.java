package java_text_book.chapter2;
import java.io.*;
public class chapter2_3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr
                = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = br.readLine();
        System.out.print("あなたの年齢を入力してください>");
        String ageString = br.readLine();
        int age = Integer.parseInt(ageString);
        double randomNum = Math.random() * 4;
        int fortune = (int)randomNum;
        System.out.println("占い結果が出ました!");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");
    }
}
