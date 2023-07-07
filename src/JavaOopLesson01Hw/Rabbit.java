package JavaOopLesson01Hw;

public class Rabbit extends Animals {
    public Rabbit(String name, Integer age, String color,
                  Integer weight, Integer height) {
        super(name, age, color, weight, height);
    }

    public String eat(int amount) {
        return "Rabbit " + getName() + " ate " + amount + " gram";
    }
}
