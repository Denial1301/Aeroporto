package models;

public class StatoVolo {
    private String programato;
    private boolean decolato;
    private float inRitardo;
    private boolean atterato;

    public void Volo(String programato, boolean decolato, float inRitardo, boolean atterato) {
        this.programato = programato;
        this.decolato = decolato;
        this.inRitardo = inRitardo;
        this.atterato = atterato;

    }

    // Getter e Setter
    public String getProgramato() {
        return programato;
    }

    public void setProgramato(String programato) {
        this.programato = programato;
    }

    public boolean getDecolato() {
        return decolato;
    }

    public void setDecolato(boolean decolato) {
        this.decolato = decolato;
    }

    public float getInRitardo() {
        return inRitardo;
    }

    public void setInRitardo(float inRitardo) {
        this.inRitardo = inRitardo;
    }

    public boolean getAtterato() {
        return atterato;
    }

    public void setAtterato(boolean atterato) {
        this.atterato = atterato;
    }
}
