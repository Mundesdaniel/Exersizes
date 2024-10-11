public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Interact with the dog
        dog.feed("Posho");
        dog.play();
        dog.bark();
        dog.sleep(2);
        dog.showInteractionHistory();

        System.out.println();


        cat.feed("milk");
        cat.play();
        cat.meow();
        cat.sleep(6);
        cat.showInteractionHistory();
    }
}
