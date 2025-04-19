public class Utente extends Autenticazione {
    private String pName;
    private String nVolo;
    public Utente(String nome_utente, String password) {
        super(nome_utente, password);
    }
public void prenotaVolo(){
        System.out.println(getNomeUtente()+"ha prenotato il volo.");
    }
public void VisualizzaVolo(){

        System.out.println(getNomeUtente()+"ha visualizzato il volo.");
    }
public void ModificaVolo(String pName, String nVolo) {
        System.out.println(getNomeUtente()+"ha modificato la prenotazione del volo.");
    }
public void CercaPasseggero(String nVolo) {

        System.out.println("passeggero trovato.");
    }
}
