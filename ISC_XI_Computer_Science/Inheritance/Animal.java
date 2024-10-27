package ISC_XI_Computer_Science.Inheritance;

public class Animal{
    String name, breed;
    int age;
    Animal(String name, String breed,int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void eat(){
        System.out.println("Animal Eats Food");
    }
    public static void main(String []args){
        Animal ob  = new Animal("Sheru","GS",10);
    }
}
