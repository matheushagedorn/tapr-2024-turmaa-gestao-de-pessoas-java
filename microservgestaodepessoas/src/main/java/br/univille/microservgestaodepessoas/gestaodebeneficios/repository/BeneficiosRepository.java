package br.univille.microservgestaodepessoas.gestaodebeneficios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservgestaodepessoas.gestaodebeneficios.entity.Beneficios;

@Repository
public interface BeneficiosRepository
    extends CrudRepository<Beneficios,String> {
}
    

