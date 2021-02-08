public class Ducks
{
    private String color;
    private int age;

    public Ducks()
    {
        this.color = "";
        this.age = 0;
    }
    public Ducks(String color, int age)
    {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Duck: \nColor = " + color + "\nAge = " + age;
    }
}
