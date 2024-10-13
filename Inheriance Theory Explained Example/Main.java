public class Main {
    public static void main(String[] args) {
        Animal animal =  new Animal("Generic animal" , "Huge" ,
                400);

        doAnimalStuff(animal, "slow"); // Generic animal, slow

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast"); // dog, fast
        // inherits from Animal

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");

        // Animal -
        // It specifies that the method doAnimalStuff expects
        // an object of the Animal class
        // (or any subclass of Animal, such as Dog) as its first argument.

        // animal -
        // It represents the actual instance (or object) of the Animal class
        // that you pass to the method when calling it.
    }

}
