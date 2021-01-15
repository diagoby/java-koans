package custom;

import com.sandwich.koan.Koan;

import java.text.MessageFormat;
import java.util.IllegalFormatException;
import java.util.MissingFormatArgumentException;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutBitwiseTricks {

    @Koan
    public void changeToOne() {
        int num = 12;
        assertEquals(-~num, __);
    }

    @Koan
    public void changeToOneOpposite() {
        int num = 12;
        assertEquals(~-num, __);
    }

    @Koan
    public void inverseValue() {
        int num = 9;
        assertEquals(~num + 1, __);
    }

    @Koan
    public void changeLetterCase() {
        final char letter = 'A';
        assertEquals((char) (letter | ' '), __);
    }

    @Koan
    public void changeLetterCaseOpposite() {
        final char letter = 'B';
        assertEquals((char) (letter & '_'), __);
    }
}
