package models;

import java.time.LocalDateTime;
import java.util.Date;

public class Volo
{
    private String codice;
    private String compagnia;
    private String aereoporto_origine;
    private String aereoporto_destinazione;
    private Date datavolo;
    private LocalDateTime oraarrivo;
    private LocalDateTime ritardo ;
    private int numPosti;
    private StatoVolo registro;


    public Volo(String codice, String compagnia, String aereoporto_origine,
                String aereoporto_destinazione, Date datavolo,
                LocalDateTime oraarrivo, LocalDateTime ritardo, int numPosti) {
        this.codice = codice;
        this.compagnia = compagnia;
        this.aereoporto_origine = aereoporto_origine;
        this.aereoporto_destinazione = aereoporto_destinazione;
        this.datavolo = datavolo;
        this.oraarrivo = oraarrivo;
        this.ritardo = ritardo;
        this.numPosti = numPosti;
        Object StatoVolo;
    }

    // Getter e Setter
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCompagnia() {
        return compagnia;
    }

    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    public String getAereoporto_origine() {
        return aereoporto_origine;
    }

    public void setAereoporto_origine(String aereoporto_origine) {
        this.aereoporto_origine = aereoporto_origine;
    }

    public String getAereoporto_destinazione() {
        return aereoporto_destinazione;
    }

    public void setAereoporto_destinazione(String aereoporto_destinazione) {
        this.aereoporto_destinazione = aereoporto_destinazione;
    }

    public Date getDatavolo() {
        return datavolo;
    }

    public void setDatavolo(Date datavolo) {
        this.datavolo = datavolo;
    }

    public LocalDateTime getOraarrivo() {
        return oraarrivo;
    }

    public void setOraarrivo(LocalDateTime oraarrivo) {
        this.oraarrivo = oraarrivo;
    }

    public LocalDateTime getRitardo() {
        return ritardo;
    }

    public void setRitardo(LocalDateTime ritardo) {
        this.ritardo = ritardo;
    }

    public int getNumPosti() {
        return numPosti;
    }

    public void setNumPosti(int numPosti) {
        this.numPosti = numPosti;
    }
}
