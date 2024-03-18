package org.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// Config class. Defined by below annotation
@Configuration
public class AppConfig {

    // We return the object. But lifecycle is maintained by Spring.
    // The default name is method name. We can define custom names like below.
    @Bean(name = {"alien1", "alien2"})
    public Alien alien() {
        return new Alien();
    }

}
