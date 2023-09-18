package shcherbyna.homeworks.homework3;

public class Cat extends Animals {

    private static int catCounter = 0;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    @Override
    public void run(int distance) {
        int maxDistance = 200;
        if (distance <= maxDistance && distance >= 0) {
            System.out.println(name + " ran " + distance + " meters.");
        } else if (distance > maxDistance) {
            System.out.println(name + " can`t run such a long distance :(");
        } else {
            System.out.println("Do you think it's funny to enter negative values?");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can`t swim at all.");
    }

    public static int getCatCounter() {
        return catCounter;
    }
}
