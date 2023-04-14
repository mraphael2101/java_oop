package animals;

public abstract class Animal {
    private int age;
    private String name;

    public Animal() {
        System.out.println("A Animal now exists without a name");
    }

    public Animal(String name) {
        System.out.println("A Animal now exists and was given the name " + name);
        this.name = name;
    }
    protected abstract int calculateRandomAge();

    protected Integer generateSecurityCode() {
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
