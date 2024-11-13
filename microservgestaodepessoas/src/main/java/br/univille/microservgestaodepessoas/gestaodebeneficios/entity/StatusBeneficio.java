package br.univille.microservgestaodepessoas.gestaodebeneficios.entity;

public class StatusBeneficio {
    private boolean statusVT;
    private boolean statusVR;
    private boolean statusPS;
    public boolean isStatusVT() {
        return statusVT;
    }
    public void setStatusVT(boolean statusVT) {
        this.statusVT = statusVT;
    }
    public boolean isStatusVR() {
        return statusVR;
    }
    public void setStatusVR(boolean statusVR) {
        this.statusVR = statusVR;
    }
    public boolean isStatusPS() {
        return statusPS;
    }
    public void setStatusPS(boolean statusPS) {
        this.statusPS = statusPS;
    }

}
