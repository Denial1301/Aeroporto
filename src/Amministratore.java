public class Amministratore  {
        private StatoVolo VoliAmministrati;
        private String nome_amministratore;
        private String password;
public Amministratore(StatoVolo VoliAmministrati, String nome_amministratore, String password) {
        this.VoliAmministrati = VoliAmministrati;
        this.nome_amministratore = nome_amministratore;
        this.password = password;
    }
        public void accesso(){
    System.out.println("Accesso effettuato con: "   + nome_utente);
    }
public void registrazione(){
    System.out.println("Registrazione effettuata con: " + nome_utente);
    }

public void InserisciVoli(){
    System.out.println("Volo inserito.");
    }
public void AggiornaVolo(){
        System.out.println("Volo aggiornato.");
    }
}
