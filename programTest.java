package TestautomatiseringProggrammering;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class programTest {
    converter conversion = new converter();

    @Test
    public void testConversionMorse() {

        conversion.convertText("A");

        String expected = "._/";
        String actual = conversion.getMorse();

        assertEquals(expected,actual);
    }
    @Test
    public void testConversionText() {

        conversion.convertMorse("._");

        String expected = "A";
        String actual = conversion.getText();

        assertEquals(expected,actual);
    }
    @Test
    public void testRead (){

        String expected = "Hello";
        String actual = writeRead.write("Hello");
        assertEquals(expected,actual);
    }
}
