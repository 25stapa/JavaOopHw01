package JavaOopLesson01Hw;

public class Animals {
    private String name;
    private Integer age;
    private String color;
    private Integer weight;
    private Integer height;


    public Animals(String name, Integer age, String color,
                   Integer weight, Integer height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(Integer newAge) {

        this.age = newAge;
    }

    public void setColor(String newColor) {

        this.color = newColor;
    }

    public void setWeight(Integer newWeight) {

        this.weight = newWeight;
    }

    public void setHeight(Integer newHeight) {

        this.height = newHeight;
    }

    public String makeSound() {

        return "   ";
    }

    public String eat(int amount) {
        return getName() + "ate " + amount + "gram";
    }

    public String move() {
        return getName() + " moves";
    }
}
