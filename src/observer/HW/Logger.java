package observer.HW;

public class Logger implements Observers {
    int temperature;
    int windspeed;
    int pressure;
    SubjectInterface subjectInterface;
    
    public Logger(SubjectInterface subjectInterface) {
        this.subjectInterface = subjectInterface;
        subjectInterface.refisterObserver(this);
    }
    
    @Override
    public void update(int a, int b, int c) {
        temperature = a;
        windspeed = b;
        pressure = c;
        logg();
    }
    
    @Override
    public String toString() {
        return "Logger{" +
                "temperature=" + temperature +
                ", windspeed=" + windspeed +
                ", pressure=" + pressure +
                '}';
    }
    
    void logg() {
        System.out.println("Updated  :" + toString());
    }
}
