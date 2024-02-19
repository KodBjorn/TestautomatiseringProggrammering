package TestautomatiseringProggrammering;

public class Main {
    public static void main(String[] args) {

        String condition;

        writeRead readWrite = new writeRead();
        converter convert = new converter();


        readWrite.write("Hello this is a program to convert morse into english or vise versa");
        readWrite.write("Press 1 if you want to translate english into morse and 2 for morse into english");
        readWrite.write("Type stop if you want to close the program");

        while (true){
            condition = readWrite.read();

            if (condition.equals("1")){

                readWrite.write("Please type the english you want to translate");
                convert.convertText(writeRead.read());
                readWrite.write(convert.getMorse());

            }else if (condition.equals("2")) {

                readWrite.write("Please type the morse that you want to translate");
                readWrite.write("When typeing morse use / to signal a new letter and // to signal a new word");
                readWrite.write("Use _ and . to represent long and short signals");
                convert.convertMorse(readWrite.read());
                readWrite.write(convert.getText());

            }else if (condition.equalsIgnoreCase("stop")){

                break;

            } else System.out.println("Type 1 to convert text, 2 to convert morse or stop to close");
        }
    }
}

