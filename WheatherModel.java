package project;

import java.io.IOException;
import java.time.Period;
import project.entity.Weather;
public interface WheatherModel {
    void getWheather (String selectedCity, Period period) throws IOException;

    public List<Weather> getSavedToDBWeather();


}
