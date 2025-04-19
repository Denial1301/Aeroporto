import java.time.LocalDateTime;
import java.util.Date;

public class VoloPartenza extends Volo {
    private Gate gateimbarco;
    private  String arrivo;

    public VoloPartenza(String codice, String compagnia, String aereoporto_origine, String aereoporto_destinazione, Date datavolo, LocalDateTime oraarrivo, LocalDateTime ritardo, int numPosti) {
        super(codice, compagnia, aereoporto_origine, aereoporto_destinazione, datavolo, oraarrivo, ritardo, numPosti);
        this.gateimbarco = null;
        this.arrivo = arrivo;
    }


    // Getter e Setter per gateimbarco
    public Gate getGateimbarco() {
        return gateimbarco;
    }

    public void setGateimbarco(Gate gateimbarco) {
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
