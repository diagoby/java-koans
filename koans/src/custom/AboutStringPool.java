package custom;

import com.sandwich.koan.Koan;

import java.text.MessageFormat;
import java.util.IllegalFormatException;
import java.util.MissingFormatArgumentException;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutStringPool {

    @Koan
    public void newStringCanBeSameAsLiteral() {
        final String str = "Ratamahatta!!!";
        final String strInstance = new String("Ratamahatta!!!");

        // Modify `strInstance` to be the same as `str`
        assertSame(str, strInstance);
    }
}
