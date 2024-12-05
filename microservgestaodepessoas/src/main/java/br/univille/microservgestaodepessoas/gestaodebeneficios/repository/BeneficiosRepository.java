package br.univille.microservgestaodepessoas.gestaodebeneficios.repository;

import org.springframework.stereotype.Repository;
import com.azure.spring.data.cosmos.repository.CosmosRepository;
import br.univille.microservgestaodepessoas.gestaodebeneficios.entity.Beneficios;
import java.util.UUID;

@Repository
public interface BeneficiosRepository extends CosmosRepository<Beneficios, UUID> {
}
