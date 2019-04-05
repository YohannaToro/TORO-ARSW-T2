package edu.eci.services;

import edu.eci.Model.entity;
import edu.eci.repository.WeatherRepository;
import edu.eci.services.contracts.IweatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WeatherServices implements IweatherServices {
    @Autowired
    @Qualifier("WeatherRepository")
    WeatherRepository weatherRepository;
    @Override
    public entity getByName(String name) {
        System.out.println("hola");
        return weatherRepository.find(name);
    }
}
