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
        return repository.save(beneficios);
    }

    @Override
    public Beneficios update(String id, Beneficios beneficios) {
        var buscaBeneficioAntigo = repository.findById(id);
        if (buscaBeneficioAntigo.isPresent()) {
            var beneficioAntigo = buscaBeneficioAntigo.get();
            beneficioAntigo.setPlanoSaude(beneficios.getPlanoSaude());

            repository.save(beneficioAntigo);
            return beneficioAntigo;
        }
        return null;
    }

    @Override
    public Beneficios delete(String id) {
        var buscaBeneficioAntigo = repository.findById(id);
        if (buscaBeneficioAntigo.isPresent()) {
            var beneficioAntigo = buscaBeneficioAntigo.get();
            repository.delete(beneficioAntigo);
            return beneficioAntigo;
        }
        return null;
    }

}
