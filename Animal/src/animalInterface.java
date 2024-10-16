//Create an Animal Interaction System using an interface, an abstract class, and inheritance.
//
//Steps:
//
//a. Create an Interface AnimalInteraction with the following methods:
//
//void feed(String food);
//void play();
//void showInteractionHistory();
//
//b.Create an Abstract Class SimpleAnimal that implements AnimalInteraction:
//
//Implement the feed method. It should ask for the food provided and store the feeding interaction in a list.
//Implement the play method. When called, it should store "play interaction" in the interaction history.
//Implement the showInteractionHistory method to display all interactions with the animal (both feedings and play sessions).
//Store interaction history using an appropriate data structure, like an ArrayList<String>.
//
//c.Create Concrete Classes:
//
//Extend SimpleAnimal into two classes, such as Dog and Cat, with additional unique behaviors:
//In the Dog class, add a method bark() that prints "The dog is barking!".
//In the Cat class, add a method meow() that prints "The cat is meowing!".
//
//d.Testing the System:
//
//Create instances of both Dog and Cat, interact with them by feeding and playing with them.
//Display their interaction histories using showInteractionHistory.
//
//Bonus: Add a method void sleep(int hours) to SimpleAnimal where it stores the sleep interaction as "Slept for X hours".

public abstract class animalInterface{
    private String feed;
    private String play;
    private String tshowInteractionHistory;


    public abstract void feed(String food);

    public abstract void play();

    public abstract void showInteractionHistory();
}

