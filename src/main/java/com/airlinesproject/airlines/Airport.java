package com.airlinesproject.airlines;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
class Airport {
    @Id
    private Long id;
    private String type;
    private String name;
    private String latitude_deg;
    private String longitude_deg;
    private String elevation_ft;
    private String continent;
    private String iso_country;
    private String iso_region;
    private String municipality;
    private String scheduled_service;
    private String gps_code;
    private String iata_code;
    private String local_code;
    private String wizzair;
    private String ryanair;
    private String airbaltic;
    private String lufthansa;
    private String turkishairlines;

    public Airport() {
    }
    public Airport(Long id, String type, String name, String latitude_deg, String longitude_deg, String elevation_ft, String continent, String iso_country, String iso_region, String municipality, String scheduled_service, String gps_code, String iata_code, String local_code, String wizzair, String ryanair, String airbaltic, String lufthansa, String turkishairlines) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.latitude_deg = latitude_deg;
        this.longitude_deg = longitude_deg;
        this.elevation_ft = elevation_ft;
        this.continent = continent;
        this.iso_country = iso_country;
        this.iso_region = iso_region;
        this.municipality = municipality;
        this.scheduled_service = scheduled_service;
        this.gps_code = gps_code;
        this.iata_code = iata_code;
        this.local_code = local_code;
        this.wizzair = wizzair;
        this.ryanair = ryanair;
        this.airbaltic = airbaltic;
        this.lufthansa = lufthansa;
        this.turkishairlines = turkishairlines;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude_deg() {
        return latitude_deg;
    }

    public void setLatitude_deg(String latitude_deg) {
        this.latitude_deg = latitude_deg;
    }

    public String getLongitude_deg() {
        return longitude_deg;
    }

    public void setLongitude_deg(String longitude_deg) {
        this.longitude_deg = longitude_deg;
    }

    public String getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(String elevation_ft) {
        this.elevation_ft = elevation_ft;
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

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getScheduled_service() {
        return scheduled_service;
    }

    public void setScheduled_service(String scheduled_service) {
        this.scheduled_service = scheduled_service;
    }

    public String getGps_code() {
        return gps_code;
    }

    public void setGps_code(String gps_code) {
        this.gps_code = gps_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public String getWizzair() {
        return wizzair;
    }

    public void setWizzair(String wizzair) {
        this.wizzair = wizzair;
    }

    public String getRyanair() {
        return ryanair;
    }

    public void setRyanair(String ryanair) {
        this.ryanair = ryanair;
    }

    public String getAirbaltic() {
        return airbaltic;
    }

    public void setAirbaltic(String airbaltic) {
        this.airbaltic = airbaltic;
    }

    public String getLufthansa() {
        return lufthansa;
    }

    public void setLufthansa(String lufthansa) {
        this.lufthansa = lufthansa;
    }

    public String getTurkishairlines() {
        return turkishairlines;
    }

    public void setTurkishairlines(String turkishairlines) {
        this.turkishairlines = turkishairlines;
    }
}
