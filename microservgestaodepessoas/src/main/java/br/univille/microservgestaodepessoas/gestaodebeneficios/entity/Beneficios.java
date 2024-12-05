package br.univille.microservgestaodepessoas.gestaodebeneficios.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;

import com.azure.core.annotation.Generated;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "beneficios", autoCreateContainer = true)
public class Beneficios {

    @Id
    @PartitionKey
    @GeneratedValue
    private String id;
    private float valeTransporte;
    private float valeRefeicao;
    private float salario;
    private float planoSaude;
    private StatusBeneficio status;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public float getValeTransporte() {
        return valeTransporte;
    }
    public void setValeTransporte(float valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
    public float getValeRefeicao() {
        return valeRefeicao;
    }
    public void setValeRefeicao(float valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getPlanoSaude() {
        return planoSaude;
    }
    public void setPlanoSaude(float planoSaude) {
        this.planoSaude = planoSaude;
    }
    public StatusBeneficio getStatus() {
        return status;
    }
    public void setStatus(StatusBeneficio status) {
        this.status = status;
    }
    
}
