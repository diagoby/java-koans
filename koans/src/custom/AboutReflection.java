package custom;

import com.sandwich.koan.Koan;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.IllegalFormatException;
import java.util.MissingFormatArgumentException;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutReflection {

    class PrivateBox {
        private String secret = "Top secret";
    }

    class IndependentBox {
        private String secret = "Don't tell anyone!";
    
        private String tellSecret() {
            return this.secret;
        }
    }

    class PersistentBox {
        private String secret = "Important document";
    
        public String getSecret() {
            return this.secret;
        }
    }

    @Koan
    public void notSoPrivate() {
        PrivateBox box = new PrivateBox();
        String secret = null;
        
        try {
            Field field = box.getClass().getDeclaredField("secret");
            field.setAccessible(true);
            secret = (String) field.get(box);
        } catch (Exception e) {}

        assertEquals(secret, __);
    }

    @Koan
    public void notSoIndependent() {
        IndependentBox box = new IndependentBox();
        String secret = null;

        try {
            Method method = box.getClass().getDeclaredMethod("tellSecret");
            method.setAccessible(true);
            secret = (String) method.invoke(box);
        } catch (Exception e) {}

        assertEquals(secret, __);
    }

    @Koan
    public void notSoPersistent() {
        PersistentBox box = new PersistentBox();
        
        try {
            Field field = box.getClass().getDeclaredField("secret");
            field.setAccessible(true);
            field.set(box, (String) "Fake document");
        } catch (Exception e) {}

        assertEquals(box.getSecret(), __);
    }


}
