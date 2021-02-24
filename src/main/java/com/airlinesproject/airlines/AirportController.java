package com.airlinesproject.airlines;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AirportController {

    private final AirportRestRepository repository;

    AirportController(AirportRestRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/airports")
    List<Airport> all() {
        return (List<Airport>) repository.findAll();
    }
    // end::get-aggregate-root[]

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/airports/bycountry/{place}")
    List<Airport> some(@PathVariable String place) {
        List<Airport> selectedValues = ((List<Airport>)repository.findAll()).stream()
                .filter(airport -> airport.getIso_country()!=null)
                .filter(airport -> airport.getIso_country().equals(place))
                .collect(Collectors.toList());
        return selectedValues;
    }
    @GetMapping("/airports/bysearch/{city}/{region}")
    List<Airport> search(@PathVariable String region, @PathVariable String city) {
        List<Airport> selectedValues = ((List<Airport>)repository.findAll()).stream()
                .filter(airport -> airport.getIso_country()!=null && airport.getIso_region()!=null)
                .filter(airport -> airport.getIso_country().equals(city) && airport.getIso_region().equals(region))
                .collect(Collectors.toList());
        return selectedValues;
    }
    // end::get-aggregate-root[]

    @PostMapping("/airports")
    Airport newAirport(@RequestBody Airport newAirport) {
        return repository.save(newAirport);
    }

    // Single item

    @GetMapping("/airports/{id}")
    Airport one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new AirportNotFoundException(id));
    }

    @PutMapping("/airports/{id}")
    Airport replaceAirport(@RequestBody Airport newAirport, @PathVariable Long id) {

        return repository.findById(id)
                .map(airport -> {
                    airport.setName(newAirport.getName());
                    airport.setType(newAirport.getType());
                    return repository.save(airport);
                })
                .orElseGet(() -> {
                    newAirport.setId(id);
                    return repository.save(newAirport);
                });
    }

    @DeleteMapping("/airports/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
