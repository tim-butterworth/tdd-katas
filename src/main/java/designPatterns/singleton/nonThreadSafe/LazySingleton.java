package designPatterns.singleton.nonThreadSafe;

public class LazySingleton {

    private static LazySingleton lazySingleton;
    private static Integer instanceCount = 0;

    private LazySingleton() {
        instanceCount++;
    }

    static LazySingleton getInstance() {
        if (LazySingleton.lazySingleton == null) {
            LazySingleton.lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

}
