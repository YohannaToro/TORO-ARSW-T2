package edu.eci.repository;


import edu.eci.Model.entity;

public interface IweatherRepository extends DAO<entity,String> {
    entity getWeatherByCityName(String name);
}
