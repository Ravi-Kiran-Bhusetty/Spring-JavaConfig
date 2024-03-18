package org.learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("26")
    private int age;
    private Computer computer;


    public Alien(Computer computer) {
        this.computer = computer;
    }

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void code() {
        System.out.println("Alien Coding");
        System.out.println(getAge());
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
