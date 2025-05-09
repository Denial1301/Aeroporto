package models;

import java.time.LocalDateTime;
import java.util.Date;

public class VoloPartenza extends Volo {
    private String gateimbarco;
    private  String arrivo;

    public VoloPartenza(String codice, String compagnia, String aereoporto_origine, String aereoporto_destinazione, Date datavolo, LocalDateTime oraarrivo, LocalDateTime ritardo, int numPosti,String gateimbarco) {
        super(codice, compagnia, aereoporto_origine, aereoporto_destinazione, datavolo, oraarrivo, ritardo, numPosti);
        this.gateimbarco = gateimbarco;
        this.arrivo = arrivo;
    }


    // Getter e Setter per gateimbarco
    public String getGateimbarco() {
        return gateimbarco;
    }

    public void setGateimbarco(String gateimbarco) {
        this.gateimbarco = gateimbarco;
    }

    // Getter e Setter per arrivo
    public String getArrivo() {
        return arrivo;
    }

    public void setArrivo(String arrivo) {
        this.arrivo = arrivo;
    }

}
