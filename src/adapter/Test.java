package adapter;

interface Drone {
    void beep();
    
    void spin_rotors();
    
}

class SuperDrone implements Drone {
    
    @Override
    public void beep() {
        System.out.println("beep");
        
    }
    
    @Override
    public void spin_rotors() {
        System.out.println("spin_rotors");
        
    }
    
}

interface Duck {
    void quack();
    
    void fly();
}

class DroneApater implements Duck {
    Drone drone;
    
    DroneApater(Drone drone) {
        this.drone = drone;
    }
    
    @Override
    public void quack() {
        drone.beep();
    }
    
    @Override
    public void fly() {
        drone.spin_rotors();
    }
}

public class Test {
    public static void main(String[] args) {
        
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneApater(drone);
        
        testDuck(droneAdapter);
    }
    
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
    
}
