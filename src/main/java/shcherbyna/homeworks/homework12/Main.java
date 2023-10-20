package shcherbyna.homeworks.homework12;


public class Main {
    private static Main instance;

    private Main() {
    }

    public static Main getInstance(){
        if (instance == null){
            instance = new Main();
        }
        return instance;
    }
}
