package shcherbyna.homeworks.homework3;

public class Dog extends Animals{

    private static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    public void run(int distance){
        int maxDistance = 500;
        if (distance <= maxDistance && distance >= 0) {
            System.out.println(name + " ran " + distance + " meters.");
        } else if (distance > maxDistance) {
            System.out.println(name + " can`t run such a long distance.");
        } else {
            System.out.println("Do you think it's funny to enter negative values?");
        }
    }

    @Override
    public void swim (int distance){
        int maxDistance = 10;
        if (distance <= maxDistance && distance >= 0) {
            System.out.println(name + " swam " + distance + " meters.");
        } else if (distance > maxDistance) {
            System.out.println(name + " can`t swim such a long distance.");
        } else {
            System.out.println("Do you think it's funny to enter negative values?");
        }
    }

    public static int getDogCounter() {
        return dogCounter;
    }
}
