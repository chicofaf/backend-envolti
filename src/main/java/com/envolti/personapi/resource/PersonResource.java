package com.envolti.personapi.resource;


import com.envolti.personapi.entity.Person;
import com.envolti.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PersonResource {
    @Autowired
    PersonRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("person")
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return ResponseEntity.ok(repository.save(person));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("person/{id}")
    public ResponseEntity<Person> findById(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("person")
    public ResponseEntity<Iterable<Person>> findAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("person/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("person")
    public ResponseEntity update(@RequestBody Person person) {
        return ResponseEntity.ok(repository.save(person));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("source")
    public ResponseEntity source() {
        return ResponseEntity.ok("frontend: https://github.com/chicofaf/frontend-envolti\n");
    }
}
