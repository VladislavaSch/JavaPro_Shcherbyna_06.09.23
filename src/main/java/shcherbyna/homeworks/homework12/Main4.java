package shcherbyna.homeworks.homework12;

public class Main4 {

    private Main4() {
    }
    private static final class InstanceHolder {
        private static final Main4 instance = new Main4();
    }
    public static Main4 getInstance() {
        return InstanceHolder.instance;
    }
}
