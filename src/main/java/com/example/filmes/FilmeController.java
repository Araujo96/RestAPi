package com.example.filmes;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class FilmeController {

    FilmeRepository repository;

    @GetMapping("/filme")
    public List<Filme> getAllFilmes(){
        return repository.findAll();
    }
    @PostMapping("/filme")
    public Filme saveFilme(@RequestBody Filme filme){
        return repository.save(filme);
    }

    @GetMapping("/filme/{id}")
    public Optional<Filme> getFilmebyId(@PathVariable Long id){
        return repository.findById(id);
    }

    @DeleteMapping("/filme/{id}")
    public void deleteFilme(@PathVariable Long id){
        repository.deleteById(id);
    }   







}
