package designPatterns.builder.requiredProperties;

import java.util.Objects;

public class AllPropsRequired {

    private String name;
    private Integer age;

    private AllPropsRequired(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static AllPropsRequiredBuilder builder() {
      return new AllPropsRequiredBuilder();
    }

    public static class AllPropsRequiredBuilder {

        private String name;
        private Integer age;

        public AllPropsRequired build() {
            Objects.requireNonNull(name, "name can not be null");
            Objects.requireNonNull(age, "age can not be null");

            return new AllPropsRequired(name, age);
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
