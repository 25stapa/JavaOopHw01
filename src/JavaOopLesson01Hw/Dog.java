package JavaOopLesson01Hw;

public class Dog extends Animals {
    public Dog(String name, Integer age, String color,
               Integer weight, Integer height) {
        super(name, age, color, weight, height);
    }

    @Override
    public String makeSound() {
        return "Dog " + getName() + " Woof";
    }

    public String eat(int amount) {
        return "Dog " + getName() + " ate " + amount + " gram";
    }
}
