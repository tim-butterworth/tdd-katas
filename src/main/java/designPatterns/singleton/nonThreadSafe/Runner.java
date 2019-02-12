package designPatterns.singleton.nonThreadSafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        LazySingleton instance3 = LazySingleton.getInstance();

        reflectivelyCreateInstance();
        reflectivelyCreateInstance();
        reflectivelyCreateInstance();
        LazySingleton reflectionInstance = reflectivelyCreateInstance();

        System.out.println(instance == reflectionInstance);
        System.out.println(instance);
        System.out.println(reflectionInstance);

        howManyInstances(instance);
    }

    private static LazySingleton reflectivelyCreateInstance() {
        try {
            Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();

            constructor.setAccessible(true);

            return constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static void howManyInstances(LazySingleton instance) {
        try {
            Field instanceCount = instance.getClass().getDeclaredField("instanceCount");
            instanceCount.setAccessible(true);

            System.out.println(instanceCount.get(instance));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
