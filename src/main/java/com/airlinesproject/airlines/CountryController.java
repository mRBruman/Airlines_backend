package com.airlinesproject.airlines;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryRestRepository repository;

    CountryController(CountryRestRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/countries")
    List<Country> all() {
        return (List<Country>) repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/receive/countries")
    Country newCountry(@ModelAttribute Country newCountry) {
        return repository.save(newCountry);
    }
}
