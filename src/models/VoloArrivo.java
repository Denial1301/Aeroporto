package models;

import java.time.LocalDateTime;
import java.util.Date;

public class VoloArrivo extends Volo
{
    private final String arrivo="Napoli";

    public VoloArrivo(String codice, String compagnia, String aereoporto_origine, String aereoporto_destinazione, Date datavolo, LocalDateTime oraarrivo, LocalDateTime ritardo, int numPosti) {
        super(codice, compagnia, aereoporto_origine, aereoporto_destinazione, datavolo, oraarrivo, ritardo, numPosti);
    }
}
