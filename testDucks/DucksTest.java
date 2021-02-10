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
    void costrNegDuck()
    {
        Ducks blankDuck = new Ducks("white", -1);
        String expected = "Duck: \nColor = white\nAge = 1";
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

    @Test
    void negAgeSet()
    {
        Ducks blankDuck = new Ducks();
        int expected = 1;
        blankDuck.setAge(-10);
        assertEquals(expected, blankDuck.getAge());
    }

    @Test
    void babySaysPeep()
    {
        Ducks babyDuck = new Ducks("white", 1);
        String expected = "peep";
        assertEquals(expected, babyDuck.speak());
    }

    @Test
    void adultSaysQuack()
    {
        Ducks adultDuck = new Ducks("white", 5);
        String expected = "quack";
        assertEquals(expected, adultDuck.speak());
    }

    @Test
    void fourYOSaysPeep()
    {
        Ducks babyDuck = new Ducks("white", 4);
        String expected = "peep";
        assertEquals(expected, babyDuck.speak());
    }

    @Test
    void deadDuckSaysCroak()
    {
        Ducks deadDuck = new Ducks("white", 100);
        String expected = "croak";
        assertEquals(expected, deadDuck.speak());
    }

    @Test
    void fourtyYOSaysCroak()
    {
        Ducks deadDuck = new Ducks("white", 40);
        String expected = "croak";
        assertEquals(expected, deadDuck.speak());
    }

    @Test
    void negativeAge()
    {
        Ducks negDuck = new Ducks("white", -3);
        String expected = "peep";
        assertEquals(expected, negDuck.speak());
    }
}