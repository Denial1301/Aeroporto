package models;

import java.util.Date;

public class Documento {
    private boolean tipo;
    private Date dataScadenza;
    private String numeroDocumento;
    private Date dataEmissione;

    // Costruttore
    public Documento(boolean tipo, Date dataScadenza, String numeroDocumento, Date dataEmissione) {
        this.tipo = tipo;
        this.dataScadenza = dataScadenza;
        this.numeroDocumento = numeroDocumento;
        this.dataEmissione = dataEmissione;
    }

    // Getter e setter (opzionali)
    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Date getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Date dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
    }
}
