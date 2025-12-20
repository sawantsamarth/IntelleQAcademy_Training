// interface -> interface = extends
// class -> interface = implements
// class -> class = extends

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

interface Movable extends Flyable, Walkable {
    void move();
}

class Bird implements Movable {

    @Override
    public void fly() {
        System.out.println("The bird can fly.");
    }

    @Override
    public void walk() {
        System.out.println("The Bird can walk.");
    }

    @Override
    public void move() {
        System.out.println("The bird can move.");
    }
}

public class Interfaces {
    public static void main(String args[]) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.walk();
        myBird.move();
    }
}
