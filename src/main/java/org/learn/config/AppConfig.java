package org.learn.config;

import org.learn.Alien;
import org.learn.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// Config class. Defined by below annotation
@Configuration
public class AppConfig {

    // We return the object. But lifecycle is maintained by Spring.
    // The default name is method name. We can define custom names like below.
    //@Bean(name = {"alien1", "alien2"})
    @Bean
    public Alien alien() {
        Alien alien = new Alien();
        alien.setAge(26);
        alien.setComputer(desktop());
        return alien;
    }

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }

}
