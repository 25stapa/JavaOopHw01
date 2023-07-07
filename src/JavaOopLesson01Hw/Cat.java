package JavaOopLesson01Hw;

public class Cat extends Animals {
    public Cat(String name, Integer age, String color,
               Integer weight, Integer height) {
        super(name, age, color, weight, height);
    }

    @Override
    public String makeSound() {
        return "Cat " + getName() + " Meow";
    }

    public String eat(int amount) {
        return "Cat "+ getName() + " ate " + amount + " gram";
    }
}
