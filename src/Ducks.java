public class Ducks {
    private String color;
    private int age;

    public Ducks(String color, int age) {
        this.color = color;
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
