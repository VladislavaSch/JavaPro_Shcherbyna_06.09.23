package shcherbyna.homeworks.homework12;

public class Main2 {
    private static Main2 instance;

    private Main2() {

    }

    public static Main2 getInstance() {
        if (instance == null) {
            synchronized (Main2.class) {
                if (instance == null) {
                    instance = new Main2();
                }
            }
        }
        return instance;
    }
    
}
