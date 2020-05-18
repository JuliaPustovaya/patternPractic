package observer.HW;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation= new WeatherStation();
        Logger l = new Logger(weatherStation);
        UserInterface userInterface = new UserInterface(weatherStation);
        weatherStation.setWeather(23, 3, 12);
        
    }
}
