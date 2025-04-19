public class Amministratore extends Autenticazione {
private StatoVolo VoliAmministrati;
public Amministratore(String nome_utente, String Password) {
        super(nome_utente,Password);
    }

public void InserisciVoli(){
    System.out.println("Volo inserito.");
    }
public void AggiornaVolo(){
        System.out.println("Volo aggiornato.");
    }
}
