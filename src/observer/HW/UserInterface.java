package observer.HW;

public class UserInterface implements Observers {
    SubjectInterface subject;
    int temperature;
    int windspeed;
    int pressure;
    
    public UserInterface(SubjectInterface subject) {
        this.subject = subject;
        subject.refisterObserver(this);
    }
    
    @Override
    public void update(int a, int b, int c) {
        temperature = a;
        windspeed = b;
        pressure = c;
        display();
    }
    
    @Override
    public String toString() {
        return "UserInterface{" +
                "temperature=" + temperature +
                ", windspeed=" + windspeed +
                ", pressure=" + pressure +
                '}';
    }
    
    void display() {
        System.out.println("updated :" + toString());
    }
}
