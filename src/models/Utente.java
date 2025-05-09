package models;

public class Utente  {
    private String pName;
    private String nVolo;
    private String nome_utente;
    private String password;

   public void Prenotazione(String pName, String nVolo, String nome_utente, String password) {
        this.pName = pName;
        this.nVolo = nVolo;
        this.nome_utente = nome_utente;
        this.password = password;
    }
public void accesso(){
    System.out.println("Accesso effettuato con: "   + nome_utente);
    }
public void registrazione(){
    System.out.println("Registrazione effettuata con: " + nome_utente);
    }
public void prenotaVolo(){
        System.out.println(nome_utente+"ha prenotato il volo.");
    }
public void VisualizzaVolo(){

        System.out.println(nome_utente+"ha visualizzato il volo.");
    }
public void ModificaVolo(String pName, String nVolo) {
        System.out.println(nome_utente+"ha modificato la prenotazione del volo.");
    }
public void CercaPasseggero(String nVolo) {

        System.out.println("passeggero trovato.");
    }
}
