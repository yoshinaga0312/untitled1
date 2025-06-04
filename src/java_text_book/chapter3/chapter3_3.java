package java_text_book.chapter3;
import java.io.*;
public class chapter3_3 {
    public static void main(String[] args)  throws IOException{
        InputStreamReader isr
                = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int isHungry = Integer.parseInt(br.readLine());
        System.out.println("こんにちは");
        if(isHungry == 1){
            System.out.println("お腹いっぱいです");
        }else{
            System.out.println("はらぺこです");
            String food = br.readLine();
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}
