package designPatterns.singleton.nonThreadSafe;

public class What {
    private static What ourInstance = new What();

    public static What getInstance() {
        return ourInstance;
    }

    private What() {
    }
}
