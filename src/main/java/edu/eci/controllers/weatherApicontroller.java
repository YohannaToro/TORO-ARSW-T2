package edu.eci.controllers;


import edu.eci.services.WeatherServices;
import edu.eci.services.contracts.IweatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/wea")
public class weatherApicontroller {

    @Autowired
    private WeatherServices weatherServices;

    @ResponseBody
    @GetMapping("/{name}")
    public ResponseEntity<?> getWeatherByCityName(@PathVariable("name") String name){
        System.out.println("hola");
        try{
            return new ResponseEntity<>(weatherServices.getByName(name),HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
