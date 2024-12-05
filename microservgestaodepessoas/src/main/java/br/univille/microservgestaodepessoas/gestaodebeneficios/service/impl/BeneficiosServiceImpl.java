package br.univille.microservgestaodepessoas.gestaodebeneficios.service.impl;

import br.univille.microservgestaodepessoas.gestaodebeneficios.service.BeneficiosService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservgestaodepessoas.gestaodebeneficios.entity.Beneficios;
import br.univille.microservgestaodepessoas.gestaodebeneficios.repository.BeneficiosRepository;

@Service
public class BeneficiosServiceImpl 
    implements BeneficiosService {

    @Autowired
    private BeneficiosRepository repository;
    
    @Override
    public List<Beneficios> getAll() {
        var retorno = repository.findAll();
        List<Beneficios> listaBeneficios = new ArrayList<Beneficios>();
        retorno.forEach(listaBeneficios::add);
        
        return listaBeneficios;
    }	

    @Override
    public Beneficios save(Beneficios beneficios) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
