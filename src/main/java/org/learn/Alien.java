package org.learn;


public class Alien {

    private int age;
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void code() {
        System.out.println("Alien Coding");
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

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
