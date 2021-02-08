import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DucksTest {
    @Test
    void initialToString()
    {
        Ducks ducks1 = new Ducks("white", 2);
        String expected = "Ducks{color='white', age=2}";
        assertEquals(expected, ducks1.toString());
    }
}