package reviews.reviews3;
import java.io.*;
public class KeyInput {
    public String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        if(inputStr.isEmpty()){
            inputStr = String.valueOf(inputStr);;
        }else{
            System.out.println("ERROR: IOException");
        }
        return inputStr;
    }
}
