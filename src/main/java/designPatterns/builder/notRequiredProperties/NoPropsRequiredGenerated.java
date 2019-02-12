package designPatterns.builder.notRequiredProperties;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public interface NoPropsRequiredGenerated {
    Optional<String> getName();
    Optional<Integer> getAge();
}
