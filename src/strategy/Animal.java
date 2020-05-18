package strategy;

public abstract class Animal {
    MovementInterface movementInterface;
    
    abstract void speak();
    
    void sleep() {
        System.out.println(" sleep");
    }
    
    void move() {
        movementInterface.move();
    }
    
}

interface MovementInterface {
    void move();
}

class MoveByLegs implements MovementInterface {
    @Override
    public void move() {
        System.out.println("Move by Legs");
    }
}

class MoveByWings implements MovementInterface {
    @Override
    public void move() {
        System.out.println("Move by Wings");
    }
}

class Cat extends Animal {
    Cat(MovementInterface movementInterface) {
        super.movementInterface = movementInterface;
    }
    
    @Override
    void speak() {
        System.out.println("meu");
    }
}

class Dou extends Animal {
    Dou(MovementInterface movementInterface) {
        super.movementInterface = movementInterface;
    }
    
    @Override
    void speak() {
        System.out.println("chirik");
    }
}

class Testi{
    public static void main(String[] args) {
        Animal animal = new Cat(new MoveByLegs());
        animal.move();
        animal.sleep();
        animal.speak();
        Animal animal2 = new Dou(new MoveByWings());
        animal2.move();
        animal2.sleep();
        animal2.speak();
    }
}

