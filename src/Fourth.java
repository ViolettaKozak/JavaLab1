import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Fourth {
    static Scanner in = new Scanner(System.in);
    static void Ex(){
        String inputtext, word, text, punkt = ",.?!;:";
        String[] splittext;
        char leter;
        int k, n;
        System.out.println("Введіть текст");
        inputtext = in.nextLine();
        splittext = inputtext.split(" ");
        n = splittext.length;
        for (int i =0; i<n;i++){
            word = splittext[i];
            if(word.length()<=2){
                k = word.length();
            }
            else {
                if(punkt.indexOf(word.charAt(word.length()-1))!=-1){
                    k=word.length()-2;
                }
                else {
                    k=word.length()-1;
                }
                leter = word.charAt(k);
                text = word.substring(0, k);
                text = text.replaceAll(String.valueOf(leter), "");
                splittext[i] = text + word.substring(k);
            }

        }
        inputtext = join(splittext, " ");
        System.out.println("Результат:");
        System.out.println(inputtext);
    }

    private static String join(String[] splittext, String s) {
        String res = "\0";
        for (String value : splittext) {
            res += value + s;
        }
        return res;
    }
}
