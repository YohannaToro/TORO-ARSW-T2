package edu.eci.repository;

import edu.eci.Model.entity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
@Component
@Qualifier("WeatherRepository")
public class WeatherRepository implements IweatherRepository{

    ConcurrentHashMap<entity,String> data= new ConcurrentHashMap<>();

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public entity getWeatherByCityName(String name) {
        return null;
    }

    @Override
    public List<entity> findAll() {
        return null;
    }

    @Override
    public entity find(String id) {

        System.out.println("hola");
        entity quote = restTemplate.getForObject("https://openweathermap.org/data/2.5/weather?q=Bogota&appid=b6907d289e10d714a6e88b30761fae22", entity.class);
        System.out.println(quote.getName());

        LocalDateTime dateTime =  LocalDateTime.now();
        if(!data.contains(quote)){
            data.put(quote,quote.getName());
        }else{
            if(dateTime.getMinute()>5){
                quote = restTemplate.getForObject("https://openweathermap.org/data/2.5/weather?q=Bogota&appid=b6907d289e10d714a6e88b30761fae22", entity.class);
            }
        }

        return quote;
    }

    @Override
    public String save(entity entity) {
        return null;
    }

    @Override
    public void update(entity entity) {

    }

    @Override
    public void delete(entity o) {

    }

    @Override
    public void remove(Long id) {

    }
}


