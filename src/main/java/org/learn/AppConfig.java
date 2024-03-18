package org.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Config class. Defined by below annotation
@Configuration
public class AppConfig {

    // We return the object. But lifecycle is maintained by Spring
    @Bean
    public Alien alien() {
        return new Alien();
    }

}
