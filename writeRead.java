package TestautomatiseringProggrammering;

import java.util.Scanner;

public class writeRead {

    Scanner scan = new Scanner(System.in);
    public static String read (){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static String write(String text){
        System.out.println(text);
       return text;
    }
}
