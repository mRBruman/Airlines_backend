package com.airlinesproject.airlines;

public class AirportNotFoundException extends RuntimeException{
    public AirportNotFoundException(Long id) {
        super("Could not find airport " + id);
    }
}
