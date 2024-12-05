package br.univille.microservgestaodepessoas.gestaodebeneficios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservgestaodepessoas.gestaodebeneficios.entity.Beneficios;
import br.univille.microservgestaodepessoas.gestaodebeneficios.service.BeneficiosService;

@RestController
@RequestMapping("api/v1/beneficios")
public class BeneficiosControllerAPI {

    @Autowired
    private BeneficiosService service;

    @GetMapping
    public ResponseEntity<List<Beneficios>> get() {
        var listaBeneficios = service.getAll();

        return new ResponseEntity<List<Beneficios>>(listaBeneficios, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Beneficios> post(@RequestBody Beneficios beneficios) {
        if (beneficios == null) {
            return new ResponseEntity<Beneficios>(HttpStatus.BAD_REQUEST);
        }
        var beneficiosSalvo = service.save(beneficios);

        return new ResponseEntity<Beneficios>(beneficiosSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Beneficios> 
        put(@PathVariable("id") String id, 
            @RequestBody Beneficios beneficios){
        if (beneficios == null || id == "" || id == null) {
            return new ResponseEntity<Beneficios>(HttpStatus.BAD_REQUEST);
        }
        
        beneficios = service.update(id, beneficios);
        if (beneficios == null) {
            return new ResponseEntity<Beneficios>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Beneficios>(beneficios, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Beneficios> 
        delete(@PathVariable("id") String id){
            if (id == "" || id == null) {
                return new ResponseEntity<Beneficios>(HttpStatus.BAD_REQUEST);
            }
            var beneficios = service.delete(id);
            if(beneficios != null){
                return new ResponseEntity<>(beneficios, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

}
