package com.airlinesproject.airlines;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Region {

    @Id
    private Long id;
    private String code;
    private String name;
    private String continent;
    private String iso_country;

    public Region(){

    }
    public Region(Long id, String code, String name, String continent, String iso_country){
        this.id = id;
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.iso_country = iso_country;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }
}
