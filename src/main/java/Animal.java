public abstract class Animal {
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    // Constructor
    public Animal(String name, int age, String type, int position) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.position = position;
    }

    // Abstract methods
    public abstract String animalSound();
    public abstract void move();

    // Concrete method
    public String sleep() {
        return "Zzz";
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getPosition() {
        return position;
    }
}
