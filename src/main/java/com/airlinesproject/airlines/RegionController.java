package com.airlinesproject.airlines;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegionController {

    private final RegionRestRepository repository;

    RegionController(RegionRestRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/regions")
    List<Region> all() {
        return (List<Region>) repository.findAll();
    }
    // end::get-aggregate-root[]

    @GetMapping("/regions/city/{country}")
    List<Region> some(@PathVariable String country) {
        List<Region> selectedValues = ((List<Region>)repository.findAll()).stream()
                .filter(region -> region.getIso_country()!=null)
                .filter(region -> region.getIso_country().equals(country))
                .collect(Collectors.toList());
        return selectedValues;
    }
    // end::get-aggregate-root[]

    @PostMapping("/regions")
    Region newRegion(@RequestBody Region newRegion) {
        return repository.save(newRegion);
    }

    // Single item

    @GetMapping("/regions/{id}")
    Region one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new AirportNotFoundException(id));
    }

    @PutMapping("/regions/{id}")
    Region replaceRegion(@RequestBody Region newRegion, @PathVariable Long id) {

        return repository.findById(id)
                .map(region -> {
                    region.setName(newRegion.getName());
                    region.setCode(newRegion.getCode());
                    return repository.save(region);
                })
                .orElseGet(() -> {
                    newRegion.setId(id);
                    return repository.save(newRegion);
                });
    }

    @DeleteMapping("/regions/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
