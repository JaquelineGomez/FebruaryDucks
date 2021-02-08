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
    @Test
    void defaultConstructor()
    {
        Ducks blankDuck = new Ducks();
        String expected = "Ducks{color='', age=0}";
        assertEquals(expected, blankDuck.toString());
    }

    @Test
    void colorGetNSet()
    {
        Ducks blankDuck = new Ducks();
        String expected= "color='yellow'";
        blankDuck.setColor("yellow");
        assertEquals(expected, blankDuck.getColor());
    }

    @Test
    void ageGetNSet()
    {
        Ducks blankDuck = new Ducks();
        String expected= "age='5'";
        blankDuck.setAge(5);
        assertEquals(expected, blankDuck.getAge());
    }
}