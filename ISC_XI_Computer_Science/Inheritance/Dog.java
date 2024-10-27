package ISC_XI_Computer_Science.Inheritance;

public class Dog extends Animal {
        public Dog(String name, String breed, int age) {
        super(name, breed, age); 
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Sheru", "German Shepherd", 10);
        dog.eat();
    }
}
