package org.learn;


public class Alien {

    private int age;
    private Desktop desktop;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void code() {
        System.out.println("Alien Coding");
        desktop.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Desktop getDesktop() {
        return desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }
}
