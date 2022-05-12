import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply() {
        assertEquals(6, SkillDemo.multiply(2, 3)); // should be 6
    }
}
