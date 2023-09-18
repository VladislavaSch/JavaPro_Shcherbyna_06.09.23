package shcherbyna.homeworks.homework3;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Josie");

        Dog dog = new Dog("Mikey");

        Dog dog2 = new Dog("Boss");

        cat.run(150);
        cat.swim(10);
        dog.run(350);
        dog.swim(5);
        dog2.run(600);
        dog2.swim(-20);

        System.out.println("There are " + Animals.getCounter() + " animals in total.");
        System.out.println("Of all the animals, there is (are) " + Cat.getCatCounter() + " cat(s).");
        System.out.println("Of all the animals, there is (are) " + Dog.getDogCounter() + " dog(s).");


    }
}
