package shcherbyna.homeworks.homework3;

public class Animals {
    final String name;
    private static int counter = 0;
    public void run(int distance) {
        System.out.println(name + " ran " + distance + " meters.");
    }
    public void swim (int distance) {
        System.out.println(name + " ran " + distance + " meters.");
    }
    public Animals(String name) {
        this.name = name;
        counter++;
    }
    public static int getCounter() {
        return counter;
    }
}
