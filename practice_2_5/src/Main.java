import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dog class test
        Dog dog_1 = new Dog("Dog_1", 5);
        dog_1.set_age(6);
        System.out.println(dog_1);

        Dog dogs[] = {new Dog("Dog_2", 9), new Dog("Dog_3", 10), new Dog("Dog_4", 11)};

        // Dog kennel test
        Dog_kennel dog_kennel = new Dog_kennel();
        System.out.println(dog_kennel);

        dog_kennel.add_dog(dog_1);
        System.out.println(dog_kennel);

        dog_kennel.add_dogs(dogs);
        System.out.println(dog_kennel);
    }
}

class Dog {
    private String name;
    private int age;

    // Init
    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\n[+] Dog object with name: " + this.name + " was created");
    }

    // Age setter
    public void set_age(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            System.out.println("Dog age setted as: " + this.age);
        }
    }

    // Age getter
    public int get_age() {
        return this.age;
    }

    // Name setter
    public void set_name(String name) {
        this.name = name;
        System.out.println("Dog name setted as: " + this.name);
    }

    // Name getter
    public String get_name() {
        return this.name;
    }

    // Dog age as human age getter
    public int get_human_age() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + this.name + " with age " + this.age;
    }
}

class Dog_kennel {
    private List<Dog> dog_kennel_array = new ArrayList<Dog>();

    {
        System.out.println("\n[+] Dog kennel object was created");
    }

    // Add one dog
    public void add_dog(Dog dog) {
        this.dog_kennel_array.add(dog);
        System.out.println(dog + ". This dog added into the dog kennel successfully");
    }

    // Add many dogs
    public void add_dogs(Dog dogs[]) {
        this.dog_kennel_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog kennel successfully");
    }

    public String toString() {
        if (!this.dog_kennel_array.isEmpty()) return "Dog kennel: " + this.dog_kennel_array;
        else return "Dog kennel empty!";
    }
}