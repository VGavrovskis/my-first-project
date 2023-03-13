package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(4);
        System.out.println(barsik.getAge());

        barsik.speak();
        barsik.feed();

        // Create getter and setters far: weight;
        // for all other fields create getter method;

        barsik.setWeight(2.45);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // Create Constructor with name, color, bread, gender, hasFur
        // Create cat with all these field passed into constructor
        // Print your cat

        //My cat's name is: %s, My cat is %d years old.printf

        Cat bob = new Cat("Bob", "black", "Simple", "male",true);
        bob.setAge(2);
        bob.setWeight(3.1);
        System.out.println(bob);

        System.out.printf("My cat's name is: %s, My cat is %d years old.\n", "Bob", 2);

        bob.walk();
        bob.walk();
        bob.walk();
        bob.walk();
        bob.walk();
        bob.walk();
        bob.walk();
        System.out.println(bob.getEnergy());

        bob.feed();
        bob.feed();
        bob.feed();
        bob.feed();
        bob.feed();
        bob.feed();
        System.out.println(bob.getEnergy());
        // Update method feed, so we can feed our cat:
        // Every feed method call increase energy


    }
}
