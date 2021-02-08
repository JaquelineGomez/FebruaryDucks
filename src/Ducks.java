public class Ducks {
    private String color;
    private int age;

    public Ducks(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Ducks()
    {
        color="";
        age=0;
    }

    public String getColor()
    {
        return "color='"+color+"'";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return "age='"+age+"'";
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ducks{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
