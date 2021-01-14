package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.*;

public class AboutAssertions {

    @Koan
    public void assertBooleanTrue() {
        // there are two possibilities, true or false, what would it be here?
        assertTrue(true);
    }

    @Koan
    public void assertBooleanFalse() {
        assertFalse(false);
    }

    @Koan
    public void assertNullObject() {
        // reference to the object can be null, a magic keyword, null, which means
        // that there is nothing there
        assertNull(null);
    }

    @Koan
    public void assertNullObjectReference() {
        Object someObject = null;
        assertNull(someObject);
    }

    @Koan
    public void assertNotNullObject() {
        // but what when there should not be a null value?
        Object someObject = new Object();
        assertNotNull(someObject);
    }

    @Koan
    public void assertEqualsUsingExpression() {
        final String HELLO_WORLD = "Hello World!";
        assertTrue("Hello World!".equals(HELLO_WORLD));
    }

    @Koan
    public void assertEqualsWithAFewExpressions() {
        final String HELLO_WORLD = "Hello World!";
        final int ONE = 1;
        final int TWO_PLUS_TWO = 4;
        final int TWO_TIMES_THREE = 6;
        final int THREE_MINUS_EIGHT = -5;
        final int TEN_DIVIDED_BY_TWO = 5;

        assertEquals("Hello World!", HELLO_WORLD);
        assertEquals(1, ONE);
        assertEquals(2 + 2, TWO_PLUS_TWO);
        assertEquals(2 * 3, TWO_TIMES_THREE);
        assertEquals(3 - 8, THREE_MINUS_EIGHT);
        assertEquals(10 / 2, TEN_DIVIDED_BY_TWO);
    }

    @Koan
    public void assertEqualsWithDescriptiveMessage() {
        // Generally, when using an assertXXX methods, expectation is on the
        // left and it is best practice to use a String for the first arg
        // indication what has failed
        final int FORTY_TWO = 42;
        assertEquals("The answer should be 42", 42, FORTY_TWO);
    }

    @Koan
    public void assertSameInstance() {
        Integer original = new Integer(1);
        Integer same = original;
        Integer different = new Integer(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one refers to the same instance as the original.
        assertSame(original, original);
    }

    @Koan
    public void assertNotSameInstance() {
        Integer original = new Integer(1);
        Integer same = original;
        Integer different = new Integer(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one of them refers to a different instance.
        assertNotSame(original, different);  // We want equal, but _not_ the same.
    }
}
