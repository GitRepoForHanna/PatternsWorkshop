package prototype;

import java.util.stream.Stream;

public class ExampleApp {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setColor("Black");
        dog.setBreed("Shepherd");

        Dog dogClone = (Dog)dog.clone();
        Stream.of(dog, dogClone)
                .forEach(System.out::println);

        System.out.println("Dog and dog clone are equal? - " + dog.equals(dogClone));
    }
}
