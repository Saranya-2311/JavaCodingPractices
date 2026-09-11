package javaPractise;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow");
    }
    public static void main(String[] args){
        Animal cat = new Cat();
        cat.makeSound();
        Animal generic = new Animal();
        generic.makeSound();
        Animal anotherCat = new Cat();
        nature();
    }

}
