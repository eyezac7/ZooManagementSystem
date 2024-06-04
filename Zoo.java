package cw.zoo;

public class Zoo {
    public static void main(String[] args) {
        
        Animal lion = new Lion("Lion", 2);
        Animal elephant = new Elephant("Elephant", 5);
        Animal monkey = new Monkey("Monkey", 7);

        // Polymorphism 
        
        lion.makeSound(); 
        lion.eat();
        lion.eat("meat");

        elephant.makeSound();
        elephant.eat();
        elephant.eat("grass");

        monkey.makeSound();
        monkey.eat();
        monkey.eat("bananas");
    }
}
