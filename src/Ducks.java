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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak()
    {
        String output = "";
        if(age < 5)
        {
            output = "peep";
        }else if(age > 39)
        {
            output = "croak";
        }
        else
        {
            output = "quack";
        }
        return output;
    }
    @Override
    public String toString()
    {
        return "Duck: \nColor = " + color + "\nAge = " + age;
    }
}
