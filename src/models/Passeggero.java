package models;

public class Passeggero {
    private String nome;
    private String cognome;
    private Documento Documentop;
    public Passeggero(String nome, String cognome,Documento Documentop) {
        this.nome = nome;
        this.cognome = cognome;
        this.Documentop=Documentop;
    }
}
