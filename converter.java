package TestautomatiseringProggrammering;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class converter {

    public static HashMap<String, String> library = new HashMap<>();
    public static HashMap<String, String> invertLibrary = new HashMap<>();
    public static String resultMorse = "";
    public static String resultText = "";

    public converter() {
        library.put("A", "._");
        library.put("B", "_...");
        library.put("C", "_._.");
        library.put("D", "_..");
        library.put("E", ".");
        library.put("F", ".._.");
        library.put("G", "__.");
        library.put("H", "....");
        library.put("I", "..");
        library.put("J", ".___");
        library.put("K", "_._");
        library.put("L", "._..");
        library.put("M", "__");
        library.put("N", "_.");
        library.put("O", "___");
        library.put("P", ".__.");
        library.put("Q", "__._");
        library.put("R", "._.");
        library.put("S", "...");
        library.put("T", "_");
        library.put("U", ".._");
        library.put("V", "..._");
        library.put("W", ".__");
        library.put("X", "_.._");
        library.put("Y", "_.__");
        library.put("Z", "__..");
        library.put("0", "_____");
        library.put("1", ".____");
        library.put("2", "..___");
        library.put("3", "...__");
        library.put("4", "...._");
        library.put("5", ".....");
        library.put("6", "_....");
        library.put("7", "__...");
        library.put("8", "___..");
        library.put("9", "____.");
        library.put(".", "._._._");
        library.put(",", "__..__");
        library.put("?", "..__..");
        library.put(" ", "//");

        for(Map.Entry<String, String> entry : library.entrySet()) {

            invertLibrary.put(entry.getValue(), entry.getKey());

        }
    }
    public static void convertText(String text) {

        resultMorse = "";

        for (int i = 0; i < text.length(); i++) {

            String letter = String.valueOf(text.charAt(i));

            if (letter.equals(" "))

                resultMorse = resultMorse + "/";

            else resultMorse = resultMorse + library.get(letter.toUpperCase()) + "/";
        }
    }
    public static void convertMorse(String morse){

        resultText = "";

        String[] temp = morse.split("/");
        System.out.println(Arrays.toString(temp));
        for (String morseLetter : temp) {

            if (invertLibrary.get(morseLetter) == null)

                resultText = resultText + " ";

            else resultText = resultText + invertLibrary.get(morseLetter);

        }

    }
    public static String getMorse(){
        return resultMorse;
    }
    public static String getText() {
        return resultText;
    }
}
