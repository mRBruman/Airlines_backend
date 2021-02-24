package com.airlinesproject.airlines;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

    private String code;
    @Id
    private String name;
    private String continent;

    public Country(){

    }
    public Country(String code, String name, String continent){
        this.code = code;
        this.name = name;
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
