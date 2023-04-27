package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Bean
    public String string () {
        return "123";
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
