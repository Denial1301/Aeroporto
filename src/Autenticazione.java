

public class Autenticazione {
   private String nome_utente;
    private String password;
public Autenticazione(String nome_utente, String password) {
    this.nome_utente = nome_utente;
    this.password = password;
}
public void accesso(){
    System.out.println("Accesso effettuato con: "   + nome_utente);
    }
public void registrazione(){
    System.out.println("Registrazione effettuata con: " + nome_utente);
    }
    public String getNomeUtente() {
        return nome_utente;
    }

    public String getPassword() {
        return password;
    }
}
