package observer.HW;

import java.util.ArrayList;

public class WeatherStation implements SubjectInterface {
    int temperature;
    int windspeed;
    int pressure;
    ArrayList<Observers> observersArrayList;
    
    public WeatherStation() {
        this.observersArrayList = new ArrayList<>();
    }
    
    public void setWeather(int temperature, int windspeed, int pressure) {
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.pressure = pressure;
        notifyObserver();
    }
    
    @Override
    public void refisterObserver(Observers o) {
        observersArrayList.add(o);
        
    }
    
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observersArrayList.size(); i++) {
            observersArrayList.get(i).update(temperature, windspeed, pressure);
        }
        
    }
    
    @Override
    public void removeObserver(Observers o) {
        observersArrayList.remove(o);
        
    }
}
