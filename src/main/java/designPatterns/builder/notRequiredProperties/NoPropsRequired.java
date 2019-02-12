package designPatterns.builder.notRequiredProperties;

public class NoPropsRequired {

    private String name;
    private Integer age;

    private NoPropsRequired(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static AllPropsRequiredBuilder builder() {
      return new AllPropsRequiredBuilder();
    }

    public static class AllPropsRequiredBuilder {

        private String name;
        private Integer age;

        public NoPropsRequired build() {
            return new NoPropsRequired(name, age);
        }

        public AllPropsRequiredBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AllPropsRequiredBuilder age(Integer age) {
            this.age = age;
            return this;
        }
    }
}
