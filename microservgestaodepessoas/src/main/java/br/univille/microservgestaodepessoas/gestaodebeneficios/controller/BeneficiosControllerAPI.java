package br.univille.microservgestaodepessoas.gestaodebeneficios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResponseEntity<List<Beneficios>> get(){
        var listaBeneficios = service.getAll();

        return new ResponseEntity<List<Beneficios>>(listaBeneficios,HttpStatus.OK);
    }
}
