package org.learn.config;

import org.learn.Alien;
import org.learn.Computer;
import org.learn.Desktop;
import org.learn.Laptop;
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
    // Computer is added as argument for loose coupling.
    // If there is a bean of that type, it will be injected here.
    public Alien alien(Computer computer) {
        Alien alien = new Alien();
        alien.setAge(26);
        alien.setComputer(computer);
        return alien;
    }

    @Bean
    public Desktop desktop() {
        return new Desktop();
    }

/*    public Laptop laptop() {
        return new Laptop();
    }*/

}
