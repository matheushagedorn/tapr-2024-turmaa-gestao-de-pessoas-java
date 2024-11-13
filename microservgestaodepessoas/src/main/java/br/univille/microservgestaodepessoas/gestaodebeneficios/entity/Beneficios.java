package br.univille.microservgestaodepessoas.gestaodebeneficios.entity;

import java.util.UUID;

public class Beneficios {

    private UUID id;
    private float valeTransporte;
    private float valeRefeicao;
    private float salario;
    private float planoSaude;
    private StatusBeneficio status;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
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
