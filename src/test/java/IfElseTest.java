import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IfElseTest {

    @Test
    void testGreaterThan10() {
        final IfElse ifElse = new IfElse();
        Assertions.assertEquals(ifElse.greaterThan10(9), "no");
        Assertions.assertEquals(ifElse.greaterThan10(10), "no");
        Assertions.assertEquals(ifElse.greaterThan10(11), "yes");
    }
}