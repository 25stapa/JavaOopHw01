package JavaOopLesson01Hw;

public class Rat extends Animals {
    public Rat(String name, Integer age, String color,
               Integer weight, Integer height) {
        super(name, age, color, weight, height);
    }

    public String eat(int amount) {
        return "Rat " + getName() + " ate " + amount + " gram";
    }
}
