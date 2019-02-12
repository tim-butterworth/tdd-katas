package designPatterns.builder.reflectionBasedProxy;

public class MethodInvocationTracker {
    private Object value;
    private Boolean invoked = false;

    public synchronized void setValue(Object value) {
        this.value = value;

        invoked = true;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MethodInvocationTracker{" +
                "value=" + value +
                ", invoked=" + invoked +
                '}';
    }
}
