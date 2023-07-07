
import JavaOopLesson01Hw.*;


public class Main {
    public static void main(String[] args) {

        Animals[] animals = {new Cat("Barcelona", 5, "Gray with white",
                3, 12),
                new Dog("Ajax", 10, "Black", 25, 40),
                new Rabbit("Pirate", 2, "Grey", 4, 10),
                new Rat("Lariska", 3, "Black", 1, 1)};

        for (Animals animal : animals) {
            System.out.println(animal.eat(4));
            System.out.println(animal.move());
            System.out.println(animal.makeSound());
        }
    }
}