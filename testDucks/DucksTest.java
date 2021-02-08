import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DucksTest
{
    @Test
    void initialToString()
    {
        Ducks duck1 = new Ducks("white", 2);
        String expected = "Duck: \nColor = white\nAge = 2";
        assertEquals(expected, duck1.toString());
    }
    @Test
    void defaultConstr()
    {
        Ducks blankDuck = new Ducks();
        String expected = "Duck: \nColor = \nAge = 0";
        assertEquals(expected, blankDuck.toString());
    }

    @Test
    void colorGetNSet()
    {
        Ducks blankDuck = new Ducks();
        String expected = "yellow";
        blankDuck.setColor("yellow");
        assertEquals(expected, blankDuck.getColor());
    }

    @Test
    void ageGetNSet()
    {
        Ducks blankDuck = new Ducks();
        int expected = 5;
        blankDuck.setAge(5);
        assertEquals(expected, blankDuck.getAge());
    }
}